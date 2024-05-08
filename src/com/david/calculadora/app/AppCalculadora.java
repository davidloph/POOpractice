package com.david.calculadora.app;

import com.david.calculadora.dominio.Calculadora;

import javax.swing.*;
import java.util.Arrays;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;
    public static final ImageIcon ICONO = new ImageIcon(AppCalculadora.class.getResource("uco.png"));

    public static void main(String[] args) {
        while (true) {
            JCheckBox redondear = new JCheckBox("Redondear");

            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación",
                    "POO - Calculadora", 0,0, ICONO,
                    Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", redondear).toArray(), null);
            int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números deseas ingresar?"));
            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }

            double numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor 1"));
            double numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor 2"));
            double resultado = 0;

            if (opcion == SUMAR) {
                resultado = Calculadora.sumar(numero1, numero2);
            } else if (opcion == RESTAR) {
                resultado = Calculadora.restar(numero1, numero2);
            } else if (opcion == MULTIPLICAR) {
                resultado = Calculadora.multiplicar(numero1, numero2);
            } else if (opcion == DIVIDIR) {
                resultado = Calculadora.dividir(numero1, numero2, redondear.isSelected());
            }

            mostrarMensaje("El resultado es " + resultado);
        }
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "POO - Calculadora", JOptionPane.ERROR_MESSAGE, ICONO);
    }
}
