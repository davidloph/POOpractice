package com.david.parcial.app;

import com.david.parcial.dominio.EPS;

public class AppEPS {
    public static void main(String[] args) {
        EPS eps = new EPS();

        eps.afiliarPaciente(1001369711,"David");
        System.out.println(eps.buscarPaciente(1001369711).getNombre());
        eps.agregarEnfermedad(1001369711,"Gonorrea");
        eps.buscarPacientesPorEnfermedad("Gonorrea");
    }
}
