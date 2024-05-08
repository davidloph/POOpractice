package com.david.ppt.dominio;

import com.david.ppt.app.AppPPT;

import javax.swing.*;
import java.util.List;

public class Juego {
    public static int jugar(){
        final ImageIcon ICONO = new ImageIcon(AppPPT.class.getResource("jugar.png"));
        String[] opciones = {"Piedra", "Papel", "Tijera", "Navaja"};
        String user = (String) JOptionPane.showInputDialog(null,"¡Juguemos!\nPor favor selecciona una opción"
                ,"POO - Piedra, Papel, Tijera o Navaja", 0,ICONO
                , opciones,opciones[0]);
        if (user == "Piedra"){
            return 0;
        } else if (user == "Papel") {
            return 1;
        } else if (user == "Tijera") {
            return 2;
        }else {
            return 3;
        }

    }
}
