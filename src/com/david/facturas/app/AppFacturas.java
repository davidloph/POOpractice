package com.david.facturas.app;

import com.david.facturas.dominio.Factura;
import com.david.facturas.dominio.Facturacion;

import java.time.LocalDate;

public class AppFacturas {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();

        facturacion.generarFactura("Davi", 60_000, LocalDate.now(), "Efectivo");
        facturacion.generarFactura("Jose", 60_000, LocalDate.now(), "Tarjeta");
        System.out.println(facturacion.getTotalFacturacion());
        System.out.println(facturacion.getFacturaSinIva());
    }
}
