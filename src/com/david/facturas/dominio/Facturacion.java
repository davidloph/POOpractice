package com.david.facturas.dominio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha, String medioPago) {
        Factura factura = null;

        //Reversa la variable factura.cliente para usarlo en palindromo
        StringBuilder reves = new StringBuilder(factura.cliente);
        reves.reverse();
        String clienteIvertido = reves.toString();

        if ( valor < 1_000_000) {
            if (cliente.toLowerCase().contains("d")){
                factura = new FacturaConDescuento(valor, cliente, fecha,0.15, medioPago);
            }else{
                factura = new FacturaSinIVA(valor, cliente, fecha, medioPago);
            }
        }else if (valor >= 1000000) {
            factura = new FacturaConIVA(valor, cliente, fecha, 0.15, medioPago);

        } else if (LocalDate.now().equals(fecha.plusDays(4))) {
            FacturaVencida facturaVencida = (FacturaVencida) factura;

        } else if (cliente.toLowerCase().equals(clienteIvertido)) {
            factura = new FacturaPalindroma(valor, cliente, fecha, medioPago);

        } else if (medioPago.toLowerCase().equals("tarjeta")) {
            factura = new FacturaConTarjCredito(valor, cliente, fecha, medioPago);

        } else if (fecha.equals(LocalDate.of(fecha.getYear(), 10, 31))) {
            factura = new FacturaHalloween(valor, cliente, fecha, medioPago);
            
        }
        /*for (Factura fact : this.facturas) {
            if (LocalDate.now().equals(fact.fecha.plusDays(4))) {
                FacturaVencida facturaVencida = (FacturaVencida) fact;
            }
        }*/
    this.facturas.add(factura);
    }

    public long getTotalFacturacion() {
        return  this.facturas.stream().mapToLong(Factura::calcularTotal).sum();
    }

    public Factura getFacturaMasCara() {
        return this.facturas.stream().max(Comparator.comparing(Factura::calcularTotal)).orElse(null);
    }

    public List<FacturaSinIVA> getFacturaSinIva() {
        List<FacturaSinIVA> facturasSinIVA = new ArrayList<>();
        for (Factura factura : facturas){
            if (factura instanceof FacturaSinIVA){
                facturasSinIVA.add((FacturaSinIVA) factura);
            }
        }
        return facturasSinIVA;
    }
}
