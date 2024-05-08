package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaConTarjCredito extends Factura{
    private static final double COMISION = 10;
    public FacturaConTarjCredito(long valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha, medioPago);
    }

    @Override
    protected long calcularTotal() {
        return (long) (this.valor*(100 + COMISION));
    }

    @Override
    public String toString() {
        return "FacturaConTarjCredito{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
