package org.upiiz.ipn;

public class Electrodomestico extends Producto {
    private String consumoEnergetico;
    private String capacidad;

    public Electrodomestico(int idProducto, String nombre, String descripcion, double precio, int cantidadDisponible,
                            String consumoEnergetico, String capacidad) {
        super(idProducto, nombre, descripcion, precio, cantidadDisponible);
        this.consumoEnergetico = consumoEnergetico;
        this.capacidad = capacidad;
    }

    public String obtenerConsumo() {
        return consumoEnergetico;
    }
}
