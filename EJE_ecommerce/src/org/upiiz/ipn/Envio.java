package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Envio {
    private String numeroGuia;
    private String direccionEntrega;
    private Date fechaDespacho;
    private String estado;
    private List<RegistroSeguimiento> registros = new ArrayList<>(); // composición: sin el envío no existen los registros

    public Envio(String numeroGuia, String direccionEntrega) {
        this.numeroGuia = numeroGuia;
        this.direccionEntrega = direccionEntrega;
        this.fechaDespacho = new Date();
        this.estado = "Preparando";
    }

    public String getNumeroGuia() {
        return numeroGuia;
    }

    public String getEstado() {
        return estado;
    }

    public void agregarRegistro(RegistroSeguimiento r) {
        registros.add(r);
    }

    public void actualizarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        agregarRegistro(new RegistroSeguimiento("Estado cambiado a " + nuevoEstado));
    }

    public List<RegistroSeguimiento> consultarSeguimiento() {
        return registros;
    }
}
