package com.david.ppt.app;


import com.david.ppt.dominio.Instrucciones;
import com.david.ppt.dominio.Juego;
import com.david.ppt.dominio.Resultados;

import javax.swing.*;
import java.util.Arrays;

public class AppPPT {
    public static final int INSTRUCCIONES = 0;
    public static final int JUGAR = 1;
    public static final int RESULTADOS = 2;
    public static final ImageIcon ICONO = new ImageIcon(AppPPT.class.getResource("pptlog.png"));

    public static void main(String[] args) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Navaja"};
        int ganado = 0;
        int perdido = 0;
        int empate = 0;
        while (true) {
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenid@!\n¿Qué quieres hacer?"
                    , "POO - Piedra, Papel o Tijera", 0, 0, ICONO
                    , Arrays.asList("Ver instrucciones", "Jugar", "Ver resultados").toArray(), null);
            if (opcion == JOptionPane.CLOSED_OPTION) {
                System.exit(0);
            }
            int bot = (int) (Math.random() * 3);   //Obtenemos un valor aleatorio de la compu


            if (opcion == INSTRUCCIONES) {
                Instrucciones.instrucciones();
            } else if (opcion == JUGAR) {
                int user = Juego.jugar();
                if (user == 0 && bot == 2 || user == 1 && bot == 0 || user == 2 && bot == 1 || user == 0 && bot == 3 || user == 2 && bot == 3) {
                    JOptionPane.showMessageDialog(null
                            , "Tú seleccionaste: "+ opciones[user] + "\nLa computadora: "+ opciones[bot] + "\n\n\n\n¡GANASTE!"
                            , "POO - Piedra, Papel o Tijera"
                            , JOptionPane.INFORMATION_MESSAGE, null);
                    ganado +=1;
                } else if (bot == 0 && user == 2 || bot == 1 && user == 0 || bot == 2 && user == 1) {
                    JOptionPane.showMessageDialog(null
                            , "Tú seleccionaste: "+ opciones[user] + "\nLa computadora: "+ opciones[bot] + "\n\n\n\nPERDISTE..."
                            , "POO - Piedra, Papel o Tijera"
                            , JOptionPane.INFORMATION_MESSAGE, null);
                    perdido += 1;
                } else if (user == bot) {
                    JOptionPane.showMessageDialog(null
                            , "Tú seleccionaste: "+ opciones[user] + "\nLa computadora: "+ opciones[bot] + "\n\n\n\n¡IMPRESIONANTE EMPATE!"
                            , "POO - Piedra, Papel o Tijera"
                            , JOptionPane.INFORMATION_MESSAGE, null);
                    empate += 1;
                }
            } else if (opcion == RESULTADOS) {
                Resultados.resultados(ganado,perdido,empate);

            }
        }
    }
}

