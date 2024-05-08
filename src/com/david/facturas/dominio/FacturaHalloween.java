package com.david.facturas.dominio;

import java.time.LocalDate;

public class FacturaHalloween extends Factura{
    public FacturaHalloween(long valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha, medioPago);
    }

    @Override
    protected long calcularTotal() {
        return 0;
    }
}
