/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfismoempleados;

import java.util.ArrayList;

/**
 *
 * @author Genaro
 */
public class PolimorfismoEmpleados {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Irina", 1000, 1000));
        empleados.add(new EmpleadoTemporal("Sofía", 24, 1000));
        empleados.add(new EmpleadoPlanta("Genaro", 1000, 800));
        empleados.add(new EmpleadoTemporal("Mario", 48, 1000));
        
        for (Empleado empleado : empleados) {
            System.out.println("Nombre empleado: " + empleado.getNombre());
            System.out.println("Sueldo de empleado: " + empleado.calcularSueldo());
            if (empleado instanceof EmpleadoPlanta){
                System.out.println("Empleado de planta");
            } else if (empleado instanceof EmpleadoTemporal){
                System.out.println("Empleado temoral");
            }
        }
    }
}
