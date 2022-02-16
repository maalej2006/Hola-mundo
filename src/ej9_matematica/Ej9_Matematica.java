/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej9_matematica;

/**
 *
 * @author Alejandro Lopez
 */
public class Ej9_Matematica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Matematicas M2 = new    Matematicas() ;
      M2 =  M2.asignarnumeros() ;
        M2.devolverMayor(M2);
        M2.calcularPotencia(M2);
        M2.calculaRaiz(M2);
    }    
}
