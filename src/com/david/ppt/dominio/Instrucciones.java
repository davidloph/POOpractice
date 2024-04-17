package com.david.ppt.dominio;

import com.david.ppt.app.AppPPT;

import javax.swing.*;
import java.util.Arrays;

public class Instrucciones {
    public static void instrucciones() {
        final ImageIcon ICONO = new ImageIcon(AppPPT.class.getResource("info.png"));
        int instrucciones = JOptionPane.showOptionDialog(null
                , "INSTRUCCIONES:\n1) El jugador deberá elegir entre Piedra, Papel o Tijera.\n2)La Piedra gana ante la Tijera, La Tijera gana ante el Papel y el Papel gana ente la Piedra.\n" +
                        "3)En caso de Empate, se jugará otra rona, y así será hasta obtener un ganador.", "INSTRUCCIONES - Piedra, Papel o Tijera", 0, 0
                , ICONO, Arrays.asList("Volver").toArray(), null);
    }
}