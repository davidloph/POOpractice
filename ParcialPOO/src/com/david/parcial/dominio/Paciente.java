package com.david.parcial.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private long cedula;
    private String nombre;
    private List<Enfermedad> enfermedades;

    public Paciente(){this.enfermedades = new ArrayList<>();}

    public void agregarEnfermedad(String nombre){
        Enfermedad enfermedad = new Enfermedad(nombre);
        this.enfermedades.add(enfermedad);
    }
    public Paciente(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Enfermedad> getEnfermedades() {
        return enfermedades;
    }

    /*public void setEnfermedades(List<Enfermedad> enfermedades) {
        this.enfermedades = enfermedades;
    }*/
}
