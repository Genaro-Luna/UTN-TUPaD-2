/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo;


public class Empleado {
    private int id;
    private String nombre, puesto;
    private double  salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados = id;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 0;
        this.id = totalEmpleados;
        totalEmpleados++;
    }
    
    public void actualizarSalario(int monto){
        if(monto > 0){
            salario += monto;
        }
    }
    
    public void actualizarSalario(double porcentaje){
        if(porcentaje > 0.0){
            salario += salario*(porcentaje/100);
        }
    }

    
    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    public static int mostrarTotalEmpleados(){
        return totalEmpleados - 1;
    }
    
}