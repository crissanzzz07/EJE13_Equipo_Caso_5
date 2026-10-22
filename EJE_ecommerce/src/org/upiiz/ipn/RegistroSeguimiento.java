package org.upiiz.ipn;

import java.util.Date;

public class RegistroSeguimiento {
    private String evento;
    private Date fechaHora;

    public RegistroSeguimiento(String evento) {
        this.evento = evento;
        this.fechaHora = new Date();
    }

    public String getEvento() {
        return evento;
    }

    public Date getFechaHora() {
        return fechaHora;
    }
}
