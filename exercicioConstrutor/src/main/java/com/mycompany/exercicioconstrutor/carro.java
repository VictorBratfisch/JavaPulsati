package com.mycompany.exercicioconstrutor;

public class carro {
    private String montadora;
    private String modelo;
    
    public carro(String montadora){
        this.montadora = montadora;
    }
    
    public carro(){}

    public String getMontadora() {
        return montadora;
    }

    public void setMontadora(String montadora) {
        this.montadora = montadora;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
