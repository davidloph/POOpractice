package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIVA{
    private double porcDescuento;

    public FacturaConDescuento(long valor, String cliente, LocalDate fecha, double porcDescuento, String medioPago) {
        super(valor, cliente, fecha, medioPago);
        this.porcDescuento = porcDescuento;
    }

    @Override
    protected long calcularTotal() {
        return this.valor -= calcularDescuento();
    }

    public long calcularDescuento(){

        return (long) (this.valor*this.porcDescuento);
    }

    @Override
    public String toString() {
        return "FacturaConDescuento{" +
                "porcDescuento=" + porcDescuento +
                ", valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
