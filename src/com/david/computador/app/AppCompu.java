package com.david.computador.app;

import com.david.computador.dominio.Computador;

public class AppCompu {
    public static void main(String[] args) {
        Computador miCompu = new Computador("Asus", "Windows", "8 GB", 475, "1920 x 1080", "4K FULL HD 1080 P", 100);
        Computador compu2 = miCompu;

        miCompu.conectarWIFI("UCO");
        miCompu.subirVolumen();
        miCompu.encender();
        miCompu.volumen = 20;
        miCompu.subirVolumen();
        miCompu.subirVolumen();
        miCompu.conectarWIFI("UCO");
        miCompu.mostrarConfiguracion();
        compu2.sistemaOperativo = "Linux";
        miCompu.mostrarConfiguracion();
        compu2.mostrarConfiguracion();


    }
}
