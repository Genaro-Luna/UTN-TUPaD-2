/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registromascotas;

/**
 *
 * @author Genaro
 */
public class RegistroMascotas {

    public static void main(String[] args) {
        Mascotas mascota = new Mascotas();
        System.out.println("Informe mascota 2023");
        mascota.mostrarInfo();
        System.out.println("Pasaron 2 anios");
        mascota.cumplirAnios();
        mascota.cumplirAnios();
        System.out.println("Informe mascota 2025");
        mascota.mostrarInfo();
    }
}
