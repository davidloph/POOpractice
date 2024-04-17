package com.david.ppt.dominio;

import com.david.ppt.app.AppPPT;

import javax.swing.*;
import java.util.Arrays;

public class Resultados {
    public static void resultados(int ganado, int perdido, int empate){
        final ImageIcon ICONO = new ImageIcon(AppPPT.class.getResource("resultados.png"));
        JOptionPane.showMessageDialog(null,"RESULTADOS\nTú: "+ ganado +" Partidas ganadas.\n" +
                "La computadora: "+ perdido + " Partidas ganadas.\nEmpates: " + empate + " Partidas.", "RESULTADOS - Piedra, Papel o Tijera"
        ,JOptionPane.INFORMATION_MESSAGE,ICONO );
    }
}
