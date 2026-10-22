package org.upiiz.ipn;

public class PrendaVestir extends Producto {
    private String talla;
    private String color;
    private String material;

    public PrendaVestir(int idProducto, String nombre, String descripcion, double precio, int cantidadDisponible,
                        String talla, String color, String material) {
        super(idProducto, nombre, descripcion, precio, cantidadDisponible);
        this.talla = talla;
        this.color = color;
        this.material = material;
    }

    public boolean verificarTallaDisponible() {
        return getCantidadDisponible() > 0;
    }
}
