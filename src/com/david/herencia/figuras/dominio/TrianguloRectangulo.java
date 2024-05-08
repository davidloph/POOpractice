package com.david.herencia.figuras.dominio;

public class TrianguloRectangulo extends Triangulo{
    private double catetoA;
    private double catetoB;
    private double hipotenusa;
    public TrianguloRectangulo(double catetoA, double catetoB) {
        this.catetoA = catetoA;
        this.catetoB = catetoB;
        this.hipotenusa = Math.sqrt(Math.pow(catetoA,2)+Math.pow(catetoB,2));

    }
    @Override
    public double calcularArea(){
        System.out.println("Calculando área de triángulo rectángulo.");
        return catetoA*catetoB/2;
    }

    @Override
    public double calcularPerimetro() {
        return catetoA+catetoB+hipotenusa;
    }
}
