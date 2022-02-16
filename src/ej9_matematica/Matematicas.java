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
public class Matematicas {

    private double numero1, numero2;

    public Matematicas(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Matematicas() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public Matematicas asignarnumeros(){
       
        Matematicas M1 = new Matematicas();

        M1.setNumero1(Math.round(Math.random() * 10));

        M1.setNumero2(Math.round(Math.random() * 10));

        System.out.println("Los numeros 1 y 2 se asignaron aleatoriamente:\n"
                + "Numero 1: " + M1.getNumero1() + " Numero 2 : " + M1.getNumero2());
        return M1;
    }
 
    public void devolverMayor(Matematicas M1) {

        if (M1.getNumero1() >= M1.getNumero2()) {
            System.out.println("El numero 1 es mayor " + M1.getNumero1());
        } else {
            System.out.println("El numero 2 es mayor que el numero 1 " + M1.getNumero2());
        }
    }

    public void calcularPotencia(Matematicas M1) {
        double mayor;
        if (M1.getNumero1() >= M1.getNumero2()) {
            mayor = Math.pow(M1.getNumero1(), Math.round(M1.getNumero2()));
        } else {
            mayor = Math.pow(M1.getNumero2(), Math.round(M1.getNumero1()));
        }
        System.out.println("El mayor número, elevado a la potencia del menor es: " + mayor);
    }

    public void calculaRaiz(Matematicas M1) {
        double raiz;
        if (M1.getNumero1() >= M1.getNumero2()) {
            raiz = Math.sqrt(M1.getNumero2());
        } else {
            raiz = Math.sqrt(M1.getNumero1());
        }
        System.out.println("La raiz cuadrada del menor numero es: " + raiz);
    }

}
