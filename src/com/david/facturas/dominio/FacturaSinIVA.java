package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura{
    public FacturaSinIVA(long valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha, medioPago);
    }

    @Override
    protected long calcularTotal() {
        return this.valor;
    }

    @Override
    public String toString() {
        return "FacturaSinIVA{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
