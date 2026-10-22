package org.upiiz.ipn;

import java.util.Date;

// Clase de asociación: guarda los datos de la relación entre una Tienda y un Producto
public class OfertaTienda {
    private Tienda tienda;
    private Producto producto;
    private boolean activoEnTienda;
    private Date fechaInicio;
    private Date fechaBaja;

    public OfertaTienda(Tienda tienda, Producto producto) {
        this.tienda = tienda;
        this.producto = producto;
        this.activoEnTienda = false;
    }

    public void activarOferta() {
        activoEnTienda = true;
        fechaInicio = new Date();
        fechaBaja = null;
        tienda.ofrecerProducto(producto);
    }

    public void finalizarOferta() {
        activoEnTienda = false;
        fechaBaja = new Date();
        tienda.retirarProducto(producto);
    }

    public boolean verificarCondiciones() {
        return producto.getCantidadDisponible() > 0;
    }

    public boolean isActivoEnTienda() {
        return activoEnTienda;
    }
}
