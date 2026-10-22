package org.upiiz;

import org.upiiz.ipn.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Integrantes del equipo:");
        System.out.println("1. Vazquez Sanchez Cristopher Farid");
        System.out.println("2. Gonzalez Fonseca Angel Eloy");
        System.out.println("3. Ornelas Mejia Leonardo Dario");
        System.out.println("4. Soto Delijorge Francisco");
        System.out.println("5. Becerra Tabuyo Diego Daniel");
        System.out.println("6. De la Torre Monsalvo Edgar Zohet");
        System.out.println("7. Lopez Hernandez Javier Alejandro");
        System.out.println("Repositorio de GitHub: https://github.com/crissanzzz07/EJE13_Equipo_Caso_5");

        // ---------- Herencia: Usuarios ----------
        System.out.println("\n--- Usuarios (herencia) ---");
        Administrador admin = new Administrador("U1", "Ana Torres", "ana@tienda.com", "admin123", 3);
        Vendedor vendedor = new Vendedor("U2", "Luis Pérez", "luis@tienda.com", "vende456", "Libros y Más", "PELL900101XXX");
        Comprador comprador = new Comprador("U3", "Farid Vázquez", "farid@correo.com", "compra789", "Calle Hidalgo 12, Zacatecas");

        System.out.println("Administrador: " + admin.getNombre() + " (nivel " + admin.getNivelPermisos() + ")");
        admin.asignarPermisos(5);
        System.out.println("Nuevo nivel de permisos: " + admin.getNivelPermisos());
        System.out.println("Vendedor: " + vendedor.getNombre() + ", negocio: " + vendedor.getNombreComercial());
        System.out.println("Comprador: " + comprador.getNombre() + ", entrega en " + comprador.getDireccionEntrega());

        // ---------- Herencia: Productos ----------
        System.out.println("\n--- Productos (herencia) ---");
        Libro libro = new Libro(1, "Java para estudiantes", "Introducción a POO", 250.0, 10,
                "J. Ramírez", "Editorial IPN", "978-607-0001");
        Electrodomestico licuadora = new Electrodomestico(2, "Licuadora", "Licuadora de 3 velocidades", 600.0, 5,
                "120 W", "1.5 litros");
        PrendaVestir playera = new PrendaVestir(3, "Playera", "Playera deportiva", 150.0, 0,
                "M", "Azul", "Algodón");
        ProductoElectronico audifonos = new ProductoElectronico(4, "Audífonos", "Audífonos inalámbricos", 400.0, 8,
                "Sony", "WH-100", "12 meses");

        System.out.println(libro.obtenerDetalle());
        System.out.println("ISBN del libro: " + libro.consultarISBN());
        System.out.println("Consumo de la licuadora: " + licuadora.obtenerConsumo());
        System.out.println("¿Hay playeras en talla M? " + playera.verificarTallaDisponible());
        System.out.println("¿Los audífonos tienen garantía? " + audifonos.verificarGarantia());

        // ---------- Agregación: Vendedor - Tienda - Producto ----------
        System.out.println("\n--- Agregación (Vendedor, Tienda, Producto) ---");
        Tienda tienda = new Tienda(1, "Libros y Más", "Tienda de libros y accesorios", "Papelería");
        vendedor.crearTienda(tienda);

        OfertaTienda ofertaLibro = new OfertaTienda(tienda, libro);
        OfertaTienda ofertaAudifonos = new OfertaTienda(tienda, audifonos);
        ofertaLibro.activarOferta();
        ofertaAudifonos.activarOferta();
        System.out.println("Tiendas de " + vendedor.getNombre() + ": " + vendedor.getTiendas().size());
        System.out.println("Productos en " + tienda.getNombre() + ": " + tienda.getProductos().size());

        ofertaAudifonos.finalizarOferta();
        System.out.println("Se retiró un producto. Ahora hay: " + tienda.getProductos().size());
        System.out.println("El producto sigue existiendo: " + audifonos.getNombre());

        // ---------- Composición: Pedido - DetalleCompra ----------
        System.out.println("\n--- Composición (Pedido y DetalleCompra) ---");
        Pedido pedido = new Pedido(100);
        pedido.agregarDetalle(libro, 2);
        pedido.agregarDetalle(audifonos, 1);
        comprador.realizarPedido(pedido);

        for (DetalleCompra d : pedido.getDetalles()) {
            System.out.println(d.getProducto().getNombre() + " x" + d.getCantidad() + " = $" + d.getSubtotal());
        }
        System.out.println("Total del pedido " + pedido.getIdPedido() + ": $" + pedido.calcularTotal());
        System.out.println("Pedidos en el historial de " + comprador.getNombre() + ": " + comprador.consultarHistorial().size());

        // ---------- Pagos (herencia) y Comprobante ----------
        System.out.println("\n--- Pagos y comprobante ---");
        PagoTarjeta pagoTarjeta = new PagoTarjeta(1, pedido.getTotal(), "4321", "AUT-9988");
        PagoTransferencia pagoTransferencia = new PagoTransferencia(2, 150.0, "REF-556677");
        PagoBilletera pagoBilletera = new PagoBilletera(3, 75.0, "TX-1234");
        comprador.getPagos().add(pagoTarjeta);
        comprador.getPagos().add(pagoTransferencia);
        comprador.getPagos().add(pagoBilletera);

        pagoTarjeta.setEstado("Pagado");
        for (Pago p : comprador.getPagos()) {
            p.mostrarInformacion();
        }
        Comprobante comprobante = new Comprobante("F-0001", pagoTarjeta);
        comprobante.mostrarInformacion();
        pedido.setEstado("Pagado");
        System.out.println("Estado del pedido: " + pedido.getEstado());

        // ---------- Envío: composición con RegistroSeguimiento y agregación con la compañía ----------
        System.out.println("\n--- Envío y seguimiento ---");
        CompaniaMensajeria compania = new CompaniaMensajeria("Estafeta");
        Envio envio = new Envio("GUIA-001", comprador.getDireccionEntrega());
        pedido.getEnvios().add(envio);
        compania.transportarEnvio(envio);

        envio.actualizarEstado("Recibido en bodega");
        envio.actualizarEstado("En camino");
        envio.actualizarEstado("Entregado");

        System.out.println("Envío " + envio.getNumeroGuia() + " con " + compania.getNombre() + ", estado: " + envio.getEstado());
        for (RegistroSeguimiento r : envio.consultarSeguimiento()) {
            System.out.println(" - " + r.getEvento());
        }
        System.out.println("Envíos que transporta " + compania.getNombre() + ": " + compania.cantidadEnvios());

        // ---------- Ciclo de vida de la composición ----------
        System.out.println("\n--- Eliminando el pedido ---");
        System.out.println("Detalles antes de eliminar: " + pedido.getDetalles().size());
        pedido.eliminar();
        System.out.println("Detalles después de eliminar: " + pedido.getDetalles().size());
        System.out.println("Estado del pedido: " + pedido.getEstado());
        System.out.println("El libro sigue existiendo: " + libro.getNombre());
    }
}
