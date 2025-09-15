/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.naveespacial;

/**
 *
 * @author Genaro
 */
public class NaveEspacial {

    public static void main(String[] args) {
        Nave nave = new Nave();
        //Primero mostramos el estado de la nave e intentamos despegar
        nave.mostrarEstado();
        nave.despegar();
        //No se puede devido a que no hay combustible
        nave.mostrarEstado();
        //Recargamos combustible y volvemos a intentar
        nave.recargarCombustible(50);
        nave.despegar();
        nave.mostrarEstado();
        //Nos muestra que despego y se usaron 5 unidades de combustible en el respegue
        //Ahora intentamos avanzar
        nave.avanzar(10);
        nave.mostrarEstado();
        //Se pudo avanzar 10 km y se restó el combustible utilizado
        //Ahora si queremos avanzar mas allá de nuestra capacidad de combustible:
        nave.avanzar(10000);
        //Nos dira que no se puede, lo mismo si queremos cargar combustible negativo
        nave.recargarCombustible(-10);
    }
}
