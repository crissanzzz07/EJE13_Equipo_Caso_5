package org.upiiz.ipn;

import java.util.Date;

public class Pago {
    protected int id;
    protected Date fecha;
    protected double importe;
    protected String estado;

    public Pago(int id, double importe) {
        this.id = id;
        this.fecha = new Date();
        this.importe = importe;
        this.estado = "Pendiente";
    }

    public int getId() {
        return id;
    }

    public double getImporte() {
        return importe;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Pago #" + id + " por $" + importe + " (" + estado + ")");
    }
}
