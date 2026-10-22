package org.upiiz.ipn;

public class DetalleCompra {
    private int cantidad;
    private double precioAplicado;
    private double subtotal;
    private Producto producto; // asociación: el detalle solo apunta al producto

    public DetalleCompra(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioAplicado = producto.getPrecio();
        calcularSubtotal();
    }

    public double calcularSubtotal() {
        subtotal = cantidad * precioAplicado;
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }
}
