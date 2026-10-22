package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.List;

public class Comprador extends Usuario {
    private String direccionEntrega;
    private List<Pedido> pedidos = new ArrayList<>(); // agregación: los pedidos existen por sí solos
    private List<Pago> pagos = new ArrayList<>();     // asociación con Pago

    public Comprador(String id, String nombre, String correo, String contraseña, String direccionEntrega) {
        super(id, nombre, correo, contraseña);
        this.direccionEntrega = direccionEntrega;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccion) {
        this.direccionEntrega = direccion;
    }

    public void realizarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> consultarHistorial() {
        return pedidos;
    }

    public List<Pago> getPagos() {
        return pagos;
    }
}
