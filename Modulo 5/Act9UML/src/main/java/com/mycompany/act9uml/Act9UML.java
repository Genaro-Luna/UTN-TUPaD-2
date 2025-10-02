/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act9uml;

/**
 *
 * @author Genaro
 */
public class Act9UML {

    public static void main(String[] args) {
        Paciente paciente = new Paciente("Mario", "IOSPER");
        Profesional profesional = new Profesional("Ricardo", "Cardiologo");
        CitaMedica cita = new CitaMedica("20/10", "8:00");
        
        cita.setPaciente(paciente);
        cita.setProfesiona(profesional);
        
        System.out.println(cita.mostrarCita());
    }
}
