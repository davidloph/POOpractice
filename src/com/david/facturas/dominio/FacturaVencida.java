package com.david.facturas.dominio;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public FacturaVencida(long valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha, medioPago);
    }

    @Override
    protected long calcularTotal() {
        return this.valor += calcularVencimiento();
    }

    public static int VLR_DIA_VENCIDO = 10000;

    public int getDiasVencidos() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), this.fecha.plusDays(4))+1;
    }

    public long calcularVencimiento() {

        return getDiasVencidos()*VLR_DIA_VENCIDO;
    }

    @Override
    public String toString() {
        return "FacturaVencida{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
