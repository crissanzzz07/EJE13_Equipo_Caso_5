package org.upiiz.ipn;

import java.util.Date;

public class Administrador extends Usuario {
    private int nivelPermisos;
    private Date fechaAsignacion;

    public Administrador(String id, String nombre, String correo, String contraseña, int nivelPermisos) {
        super(id, nombre, correo, contraseña);
        this.nivelPermisos = nivelPermisos;
        this.fechaAsignacion = new Date();
    }

    public int getNivelPermisos() {
        return nivelPermisos;
    }

    public Date getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void asignarPermisos(int nivel) {
        this.nivelPermisos = nivel;
        this.fechaAsignacion = new Date();
    }
}
