package org.upiiz.ipn;

public class PagoTransferencia extends Pago {
    private String referenciaBancaria;

    public PagoTransferencia(int id, double importe, String referenciaBancaria) {
        super(id, importe);
        this.referenciaBancaria = referenciaBancaria;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("  Transferencia con referencia " + referenciaBancaria);
    }
}
