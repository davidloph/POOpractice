package com.david.parcial.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EPS {
    public static final byte CAPACIDAD = 100;
    private String nombre;
    private List <Paciente> pacientes;

    public EPS() {
        this.pacientes = new ArrayList<>();
    }

    public boolean afiliarPaciente(long cedula, String nombre){
        if (this.pacientes.size()<CAPACIDAD){
            if (buscarPaciente(cedula) == null){
                Paciente paciente = new Paciente(cedula, nombre);
                this.pacientes.add(paciente);
                return true;
            }else{
                System.out.println("El paciente ya se encuentra afiliado.");
            }

        }else{
            System.out.println("No se permiten más pacientes.");
        }


        return false;
    }

    public void sacarPaciente(long cedula){
        if (buscarPaciente(cedula) != null) {
            this.pacientes.remove(buscarPaciente(cedula));
        }else{
            System.out.println("El paciente con cédula " + cedula + " no existe en la EPS.");
        }

    }

    public Paciente buscarPaciente(long cedula){
        Paciente pacienteABuscar = null;
        for (Paciente paciente : this.pacientes){
            if (paciente.getCedula() == cedula){
                pacienteABuscar = paciente;
                break;
            }
        }
        return pacienteABuscar;
    }

    public List<Paciente> buscarPacientesPorEnfermedad(String enfermedad) {
        List<Paciente> pacientesEnfermedad = new ArrayList<>();
        for (Paciente paciente : this.pacientes) {
            for (Enfermedad illness : paciente.getEnfermedades()) {
                if (illness.getNombre().equalsIgnoreCase(enfermedad)) {
                    pacientesEnfermedad.add(paciente);
                }
            }
        }
        return pacientesEnfermedad;
    }

    public List<Paciente> obtenerPacientesSinEnfermedad(){
        List<Paciente> pacientesAliviados = new ArrayList<>();
        for (Paciente paciente : this.pacientes){
            if (paciente.getEnfermedades().isEmpty()){
                pacientesAliviados.add(paciente);
            }
        }
        return pacientesAliviados;
    }

    public void ordenarPacientesPorNombre(){
        Collections.sort( pacientes , Comparator.comparing(Paciente::getNombre).reversed());
    }

    public void agregarEnfermedad(long cedula, String nombreEnfermedad){
        ;
    }

}
