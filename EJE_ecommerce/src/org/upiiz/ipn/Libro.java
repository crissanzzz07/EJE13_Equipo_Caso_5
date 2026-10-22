package org.upiiz.ipn;

public class Libro extends Producto {
    private String autor;
    private String editorial;
    private String isbn;

    public Libro(int idProducto, String nombre, String descripcion, double precio, int cantidadDisponible,
                 String autor, String editorial, String isbn) {
        super(idProducto, nombre, descripcion, precio, cantidadDisponible);
        this.autor = autor;
        this.editorial = editorial;
        this.isbn = isbn;
    }

    public String consultarISBN() {
        return isbn;
    }
}
