package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaConIVA extends Factura{
    private double porcIva;

    public FacturaConIVA(long valor, String cliente, LocalDate fecha, double porcIva, String medioPago) {
        super(valor, cliente, fecha, medioPago);
        this.porcIva = porcIva;
    }

    @Override
    public String toString() {
        return "FacturaConIVA{" +
                "porcIva=" + porcIva +
                ", valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }

    @Override
    protected long calcularTotal() {
        return this.valor+(calcularIva());
    }

    public long calcularIva() {

        return (long) (this.valor*this.porcIva);
    }
}
