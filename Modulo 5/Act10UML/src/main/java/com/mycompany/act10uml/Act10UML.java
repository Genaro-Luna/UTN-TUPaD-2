/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.act10uml;

/**
 *
 * @author Genaro
 */
public class Act10UML {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("02130023001", 20342.4, "1234", "24/8/2015");
        Titular titular = new Titular("Genaro", 44369231);
        titular.setCuenta(cuenta);
        System.out.println("Detalles de la cuenta");
        System.out.println(cuenta.mostrarCuenta());
    }
}
