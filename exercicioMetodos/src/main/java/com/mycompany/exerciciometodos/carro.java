package com.mycompany.exerciciometodos;
    
public abstract class carro {
    private int potencia;
    private double velocidade;
    private String marca;

    public abstract void acelera();
    public abstract void mostrar();

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
