package com.mycompany.exemplointerface;

public class ExemploInterface {

    public static void main(String[] args) {
        moto objMoto = new moto();
        carro objCarro = new carro();
        
        objCarro.dirige();
        objMoto.dirige();
    }
}
