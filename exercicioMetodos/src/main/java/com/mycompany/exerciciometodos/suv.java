package com.mycompany.exerciciometodos;

public class suv extends carro {
    
    private int velocidadeSuv;

    @Override
    public void acelera() {
        if(getPotencia() >= 200){
            setVelocidadeSuv(200);
        }else{
            setVelocidadeSuv(150);
        }
    }

    public int getVelocidadeSuv() {
        return velocidadeSuv;
    }

    public void setVelocidadeSuv(int velocidadeSuv) {
        this.velocidadeSuv = velocidadeSuv;
    }

    @Override
    public void mostrar() {
        System.out.println("A velocidade do SUV é de: "+getVelocidadeSuv());
    }
    
}
