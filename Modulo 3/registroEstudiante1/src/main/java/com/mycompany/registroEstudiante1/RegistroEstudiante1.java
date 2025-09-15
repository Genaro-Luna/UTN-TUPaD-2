/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modulo3;
import java.util.Scanner;
/**
 *
 * @author Genaro
 */
public class RegistroEstudiante1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Estudiante alumno = new Estudiante();
        alumno.mostrarInfo();
        alumno.subirCalificacion(7.4);
        alumno.mostrarInfo();
        alumno.bajarCalificacion(2.0);
        alumno.mostrarInfo();

    }
}
