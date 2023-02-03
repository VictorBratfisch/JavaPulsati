package com.mycompany.exercicio2;

public class Exercicio2 {

    public static void main(String[] args) {
        computador obj1 = new computador();
        obj1.memoria = 500;
        obj1.processador = "i5";
        obj1.imprimeComputador();
        
        computador obj2 = new computador();
        obj2.memoria = 750;
        obj2.processador = "i7";
        obj2.imprimeComputador();
    }
}
