package com.mycompany.exerciciometodos2;

public class aviao implements transporte{

    
    private int velocidadeAviao;
    @Override
    public void move() {
        setVelocidadeAviao(distancia / getVelocidadeAviao());
    }

    public int getVelocidadeAviao() {
        return velocidadeAviao;
    }

    public void setVelocidadeAviao(int velocidadeAviao) {
        this.velocidadeAviao = velocidadeAviao;
    }

    @Override
    public void mostrar() {
        System.out.println("O tempo de viagem de avião é de: "+getVelocidadeAviao());
    }
    
}
