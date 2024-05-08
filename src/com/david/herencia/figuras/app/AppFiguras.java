package com.david.herencia.figuras.app;

import com.david.herencia.figuras.dominio.FigurasGeometricas;
import com.david.herencia.figuras.dominio.Triangulo;
import com.david.herencia.figuras.dominio.TrianguloEquilatero;
import com.david.herencia.figuras.dominio.TrianguloRectangulo;

public class AppFiguras {
    public static void main(String[] args) {
        Triangulo triangulo = new TrianguloEquilatero(3);
        Triangulo triangulo1 = new TrianguloRectangulo(4,4);
        calcularValores(triangulo1);

    }
    public static void calcularValores(FigurasGeometricas figura){
        System.out.println(figura.calcularArea());
        System.out.println(figura.calcularPerimetro());
    }
}
