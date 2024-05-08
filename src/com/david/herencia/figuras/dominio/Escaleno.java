package com.david.herencia.figuras.dominio;

public class Escaleno extends Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    public Escaleno(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public double calcularArea() {
        return Math.sqrt((calcularPerimetro()/2)*((calcularPerimetro()/2)-ladoA)*((calcularPerimetro()/2)-ladoB)*((calcularPerimetro()/2)-ladoC));
    }

    @Override
    public double calcularPerimetro() {
        return ladoA+ladoB+ladoC;
    }
}
