package org.upiiz.ipn;

public class Producto {
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadDisponible;

    public Producto(int idProducto, String nombre, String descripcion, double precio, int cantidadDisponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio;
    }

    // suma la cantidad al stock (si es negativa, lo reduce)
    public void actualizarStock(int cantidad) {
        this.cantidadDisponible += cantidad;
    }

    public String obtenerDetalle() {
        return nombre + " - " + descripcion + " ($" + precio + ", disponibles: " + cantidadDisponible + ")";
    }
}
