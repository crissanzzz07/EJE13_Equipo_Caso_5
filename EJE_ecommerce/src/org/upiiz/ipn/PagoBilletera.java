package org.upiiz.ipn;

public class PagoBilletera extends Pago {
    private String idTransaccionProveedor;

    public PagoBilletera(int id, double importe, String idTransaccionProveedor) {
        super(id, importe);
        this.idTransaccionProveedor = idTransaccionProveedor;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Billetera digital, transacción " + idTransaccionProveedor);
    }
}
