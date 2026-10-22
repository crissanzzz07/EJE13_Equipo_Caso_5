package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Usuario {
    private String nombreComercial;
    private String identificacionFiscal;
    private double calificacion;
    private List<Tienda> tiendas = new ArrayList<>(); // agregación: las tiendas existen por sí solas

    public Vendedor(String id, String nombre, String correo, String contraseña,
                    String nombreComercial, String identificacionFiscal) {
        super(id, nombre, correo, contraseña);
        this.nombreComercial = nombreComercial;
        this.identificacionFiscal = identificacionFiscal;
        this.calificacion = 0;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public String getIdentificacionFiscal() {
        return identificacionFiscal;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void actualizarCalificacion(double nueva) {
        this.calificacion = nueva;
    }

    public void crearTienda(Tienda tienda) {
        tiendas.add(tienda);
    }

    public List<Tienda> getTiendas() {
        return tiendas;
    }
}
