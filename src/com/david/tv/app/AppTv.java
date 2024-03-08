package com.david.tv.app;

import com.david.tv.dominio.Televisor;
public class AppTv {
    public static void main(String[] args) {
        Televisor miTV = new Televisor("Samsung", 1080, 12,"4K FULL HD 1080 P");

        miTV.puerto = "AV-1";
        miTV.canal= 300;
        miTV.encendido = false;

        miTV.encender();
        miTV.bajarVolumen();
        miTV.bajarVolumen();
        miTV.bajarVolumen();
        miTV.cambiarPuerto("HDMI");
        miTV.pasarCanal(308);
        miTV.pasarCanal(500);
        miTV.mostrarConfiguracion();

    }

}
