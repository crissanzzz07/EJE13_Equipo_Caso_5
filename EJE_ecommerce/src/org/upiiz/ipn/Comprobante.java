package org.upiiz.ipn;

import java.util.Date;

public class Comprobante {
    private String folio;
    private Date fechaEmision;
    private double importePagado;
    private Pago pago; // asociación: el comprobante conoce el pago que lo generó

    public Comprobante(String folio, Pago pago) {
        this.folio = folio;
        this.pago = pago;
        this.fechaEmision = new Date();
        this.importePagado = pago.getImporte();
    }

    public void mostrarInformacion() {
        System.out.println("Comprobante " + folio + " por $" + importePagado);
        pago.mostrarInformacion();
    }
}
