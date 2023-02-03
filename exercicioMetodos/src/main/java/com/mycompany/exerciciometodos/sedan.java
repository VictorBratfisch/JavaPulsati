package com.mycompany.exerciciometodos;

public class sedan extends carro {
    
    private int velocidadeSedan;

    @Override
    public void acelera() {
        if(getPotencia() >= 200){
            setVelocidadeSedan(250);
        }else{
            setVelocidadeSedan(180);
        }
    }

    public int getVelocidadeSedan() {
        return velocidadeSedan;
    }

    public void setVelocidadeSedan(int velocidadeSedan) {
        this.velocidadeSedan = velocidadeSedan;
    }

    @Override
    public void mostrar() {
        System.out.println("A velocidade do sedan é de: "+getVelocidadeSedan());
    }
        
}
