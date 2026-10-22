package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.List;

public class CompaniaMensajeria {
    private String nombre;
    private List<Envio> envios = new ArrayList<>(); // agregación: los envíos existen aunque cambie la compañía

    public CompaniaMensajeria(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void transportarEnvio(Envio e) {
        envios.add(e);
    }

    public int cantidadEnvios() {
        return envios.size();
    }
}
