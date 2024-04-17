package com.david.taller.punto1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contacto> contactos;
    public Agenda(){
        this.contactos = new ArrayList<>();
    }

    public void crearContacto(String nombre, String apellido, long celular){
         Contacto contacto = new Contacto(nombre, apellido, celular);

    }

    public void eliminarContacto(long celular){

    }

    public List<Contacto> buscar(String nombre){
        return null;
    }

    public List<Contacto> buscarPorApellido(String apellido){
        return null;
    }

    public Contacto buscar(long celular){
        return null;
    }

    public void cambiarCelular(long viejoCelular, long nuevoCelular){

    }

    public List<Contacto> ordenar(){
        return null;
    }
}
