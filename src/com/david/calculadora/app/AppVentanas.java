package com.david.calculadora.app;

import javax.swing.*;
import java.util.Arrays;

public class AppVentanas {
    private static final ImageIcon ICONO = new ImageIcon(AppVentanas.class.getResource("uco.png"));


    public static void main(String[] args) {
        //        String nombre = (String) JOptionPane.showInputDialog(null, "Ingresa tu nombre",
//                "Carolina", JOptionPane.QUESTION_MESSAGE, ICONO, Arrays.asList("Alejo", "Braulio").toArray(), null);

        int opcion = JOptionPane.showOptionDialog(null, "Que quieres hacer", "POO",
                0,0, ICONO, Arrays.asList("Alejo", "Braulio").toArray(), null);
        mostrarMensaje("Elegiste: " + opcion);


        int opcionElegida = JOptionPane.showConfirmDialog(null, "Que quieres hacer?",
                "POO", JOptionPane.YES_NO_OPTION);

        switch (opcionElegida) {
            case JOptionPane.YES_OPTION:
                mostrarMensaje("Eligió SI");
                break;
            case JOptionPane.NO_OPTION:
                mostrarMensaje("Eligió CANCELAR");
                break;
            case JOptionPane.CANCEL_OPTION:
                mostrarMensaje("Eligió CANCELADO");
                break;
            case JOptionPane.CLOSED_OPTION:
                mostrarMensaje("Eligió CLOSE");
                break;
        }
    }

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje,
                "POO", JOptionPane.ERROR_MESSAGE, ICONO);
    }
}
