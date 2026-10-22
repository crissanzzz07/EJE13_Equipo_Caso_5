package org.upiiz.ipn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Tienda {
    private int idTienda;
    private String nombre;
    private String descripcion;
    private String categoriaComercial;
    private Date fechaCreacion;
    private List<Producto> productos = new ArrayList<>(); // agregación: los productos existen sin la tienda

    public Tienda(int idTienda, String nombre, String descripcion, String categoriaComercial) {
        this.idTienda = idTienda;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoriaComercial = categoriaComercial;
        this.fechaCreacion = new Date();
    }

    public int getIdTienda() {
        return idTienda;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void ofrecerProducto(Producto p) {
        productos.add(p);
    }

    public void retirarProducto(Producto p) {
        productos.remove(p);
    }
}
