/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.act9uml;

/**
 *
 * @author Genaro
 */
public class CitaMedica {
    private String fecha, hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        if(paciente != null){
            this.paciente = paciente;
        }
    }

    public void setProfesiona(Profesional profesional) {
        if(profesional != null){
           this.profesional = profesional; 
        }
    }

    
    public String mostrarCita() {
        return "CitaMedica{" + "fecha=" + fecha + ", hora=" + hora + "\n" + paciente.mostrarPaciente() + "\n" + profesional.mostrarProfesional();
    }
    
}
