/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

public class TPmodulo4 {
    public static void main(String[] args) {
        int totalEmpleados;
        
        Empleado e1 = new Empleado(1, "Genaro", "Ciberseguridad", 2000);
        Empleado e2 = new Empleado("Matias", "Developer");
        Empleado e3 = new Empleado(3, "Maximiliano", "Contabilidad", 1900);
        Empleado e4 = new Empleado("Agustina", "Administracion");
        totalEmpleados = Empleado.mostrarTotalEmpleados();
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        e1.actualizarSalario(50.0);
        e2.actualizarSalario(3000);
        e3.actualizarSalario(10.0);
        e4.actualizarSalario(1000);        
        System.out.println("");
        System.out.println("Salarios actualizados");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
        System.out.println("");
        System.out.println("Empleados en la empresa");
        System.out.println("Total empleados: "+totalEmpleados);
    }
}
