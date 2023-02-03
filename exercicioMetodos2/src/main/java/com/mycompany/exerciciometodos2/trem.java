package com.mycompany.exerciciometodos2;

public class trem implements transporte{

    private int velocidadeTrem;
    @Override
    public void move() {
        setVelocidadeTrem(distancia / getVelocidadeTrem());
    }

    public int getVelocidadeTrem() {
        return velocidadeTrem;
    }

    public void setVelocidadeTrem(int velocidadeTrem) {
        this.velocidadeTrem = velocidadeTrem;
    }

    @Override
    public void mostrar() {
        System.out.println("O tempo de viagem de trem é de: "+getVelocidadeTrem());
    }
    
}
