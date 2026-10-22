package org.upiiz.ipn;

public class PagoTarjeta extends Pago {
    private String ultimosCuatroDigitos;
    private String autorizacion;

    public PagoTarjeta(int id, double importe, String ultimosCuatroDigitos, String autorizacion) {
        super(id, importe);
        this.ultimosCuatroDigitos = ultimosCuatroDigitos;
        this.autorizacion = autorizacion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Tarjeta terminada en " + ultimosCuatroDigitos + ", autorización " + autorizacion);
    }
}
