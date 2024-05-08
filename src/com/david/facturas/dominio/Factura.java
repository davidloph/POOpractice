package com.david.facturas.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fecha;
    protected String medioPago;

    public Factura(long valor, String cliente, LocalDate fecha, String medioPago) {
        this.valor = valor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.medioPago = medioPago;
    }

    protected abstract long calcularTotal();
}
