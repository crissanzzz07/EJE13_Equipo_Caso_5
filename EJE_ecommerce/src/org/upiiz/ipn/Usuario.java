package org.upiiz.ipn;

public class Usuario {
    private String id;
    private String nombre;
    private String correo;
    private String contraseña;

    public Usuario(String id, String nombre, String correo, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void actualizarInformacion(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public void cambiarContraseña(String nueva) {
        this.contraseña = nueva;
    }
}
