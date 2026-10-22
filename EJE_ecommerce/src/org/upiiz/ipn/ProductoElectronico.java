package org.upiiz.ipn;

public class ProductoElectronico extends Producto {
    private String marca;
    private String modelo;
    private String periodoGarantia;

    public ProductoElectronico(int idProducto, String nombre, String descripcion, double precio, int cantidadDisponible,
                               String marca, String modelo, String periodoGarantia) {
        super(idProducto, nombre, descripcion, precio, cantidadDisponible);
        this.marca = marca;
        this.modelo = modelo;
        this.periodoGarantia = periodoGarantia;
    }

    public boolean verificarGarantia() {
        return periodoGarantia != null && !periodoGarantia.isEmpty();
    }
}
