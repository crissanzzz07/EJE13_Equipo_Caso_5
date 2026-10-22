package org.upiiz.ipn;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int idPedido;
    private LocalDate fecha;
    private String estado;
    private double total;
    private List<DetalleCompra> detalles = new ArrayList<>(); // composición: los detalles nacen y mueren con el pedido
    private List<Envio> envios = new ArrayList<>();           // asociación con Envio

    public Pedido(int idPedido) {
        this.idPedido = idPedido;
        this.fecha = LocalDate.now();
        this.estado = "Pendiente";
        this.total = 0;
    }

    // el detalle se crea aquí adentro, por eso es composición
    public void agregarDetalle(Producto p, int c) {
        detalles.add(new DetalleCompra(p, c));
        calcularTotal();
    }

    // borra el pedido junto con todos sus detalles
    public void eliminar() {
        detalles.clear();
        total = 0;
        estado = "Eliminado";
    }

    public double calcularTotal() {
        total = 0;
        for (DetalleCompra d : detalles) {
            total += d.calcularSubtotal();
        }
        return total;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getTotal() {
        return total;
    }

    public List<DetalleCompra> getDetalles() {
        return detalles;
    }

    public List<Envio> getEnvios() {
        return envios;
    }
}
