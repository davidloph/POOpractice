package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaPalindroma extends Factura{
    private static final double PORC_DESCUENTO = 69;
    public FacturaPalindroma(long valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha, medioPago);
    }

    @Override
    protected long calcularTotal() {
        return (long) (this.valor*(100-PORC_DESCUENTO));
    }

    @Override
    public String toString() {
        return "FacturaPalindroma{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
