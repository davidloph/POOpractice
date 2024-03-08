package com.david.computador.dominio;

public class Computador {
    public String marca;

    public String tamaño;

    public boolean camara;

    public boolean usbin;

    public int volumen;

    public int bateria;

    public boolean encendido;

    public String resolucionCamara;

    public String sistemaOperativo;

    public boolean conexionWIFI;

    public String ram;

    public float almacenamientoTotal;

    public boolean microfono;

    //Valores de Identidad de Computador

    public Computador(String marca, String sistemaOperativo, String ram, float almacenamientoTotal, String tamaño, String resolucionCamara, int bateria){
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.ram = ram;
        this.almacenamientoTotal = almacenamientoTotal;
        this.tamaño = tamaño;
        this.resolucionCamara = resolucionCamara;
        this.bateria = bateria;
    }

    //Acciones
    public void encender(){
        this.encendido = true;
    }
    public  void apagar(){
        this.encendido = false;
    }

    public void encenderCamara(){
        if (this.encendido == true) {
            this.camara = true;
            this.bateria -= 1;
        }
        else{
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void apagarCamara() {
        if (this.encendido == true) {
            this.camara = false;
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void subirVolumen() {
        if (this.encendido == true) {
            this.volumen += 1;
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void bajarVolumen() {
        if (this.encendido == true) {
            this.volumen -= 1;
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void conectarWIFI(String nombreDeRed) {
        if (this.encendido == true) {
            this.conexionWIFI = true;
            System.out.println("Conectado a la red: ");
            System.out.println(nombreDeRed);
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void desconectarRed() {
        if (this.encendido == true) {
            this.conexionWIFI = false;
            System.out.println("Te has deconectado de la red.");
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void configurarResolucionCam(String resolucionACambiar) {
        if (this.encendido == true) {
            if (camara == true) {
                this.resolucionCamara = resolucionACambiar;
                this.bateria -= 1;
            }
            else{
                System.out.println("Enciende la cámara para modificar su resolución");
            }
        }
        else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void encenderMicro() {
        if (this.encendido == true) {
            this.microfono = true;
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }

    public void apagarMicro() {
        if (this.encendido == true) {
            this.microfono = false;
            this.bateria -= 1;
        } else {
            System.out.println("El computador se encuentra apagado");
        }
    }
    public void mostrarConfiguracion(){
        System.out.println("La configuracion actual del Computador es: "+ "\n" + this.marca+ "\n"+this.tamaño + "\n"+ this.camara+ "\n"+this.usbin + "\n" + this.volumen+ "\n"+this.bateria + "\n"+ this.resolucionCamara+ "\n"+this.sistemaOperativo + "\n" + this.conexionWIFI + "\n"+this.ram + "\n" + this.almacenamientoTotal + "\n"+this.microfono + "\n"+this.bateria);
    }
}
