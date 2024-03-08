package com.david.tv.dominio;

public class Televisor {

    public String marca;

    public int tamaño;

    public String resolucion;

    public String puerto;

    public int volumen;

    public int canal;

    public boolean encendido;


    public Televisor (String marcaTV, int tamañoTV, int volumen, String resolution){
        this.marca = marcaTV;
        this.tamaño = tamañoTV;
        this.volumen = volumen;
        this.resolucion = resolution;
    }


    public void encender() {
        this.encendido = true;
    }

    public void apagar() {
        this.encendido = false;
    }

    public void pasarCanal(int canalACambiar) {
        this.canal = canalACambiar;
    }

    public void subirVolumen() {
        this.volumen += 1;
    }

    public void bajarVolumen() {
        this.volumen -= 1;
    }

    public void cambiarPuerto(String puertoACambiar) {
        this.puerto = puertoACambiar;
    }

    public void configurarResolucion(String resolucionACAmbiar) {
        this.resolucion = resolucionACAmbiar;
    }

    public void mostrarConfiguracion(){
        System.out.println("La configuracion actual del TV es: "+ this.puerto+ "\n"+this.volumen + "\n"+ this.canal+ "\n"+this.encendido);
    }
}
