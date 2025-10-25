/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polimorfismoempleados;

/**
 *
 * @author Genaro
 */
public class EmpleadoTemporal extends Empleado {
    private int horasTrabajadas;
    private double sueldo;

    public EmpleadoTemporal(String nombre, int horasTrabajadas, double sueldo) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.sueldo = sueldo;
    }

    @Override
    public double calcularSueldo() {
        return horasTrabajadas * sueldo;
    }
}

