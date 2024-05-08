package com.david.herencia.figuras.dominio;

public class TrianguloEquilatero extends Triangulo{
    private double lado;
    public TrianguloEquilatero(double ladoA) {
        this.lado = ladoA;
    }

    @Override
    public double calcularArea(){
        System.out.println("Calculando área de triángulo equilatero.");
        return (lado*lado*Math.sqrt(3))/4;
    }

    @Override
    public double calcularPerimetro(){
        return 3*lado;
    }



}
