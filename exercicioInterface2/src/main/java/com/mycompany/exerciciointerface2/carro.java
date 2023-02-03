package com.mycompany.exerciciointerface2;

public class carro implements veiculo{

    private int velocidadeCarro;
    
    carro(){
        setVelocidadeCarro(velocidade);
    }
    
    @Override
    public void acelerar() {
        setVelocidadeCarro(getVelocidadeCarro() + 70);
        System.out.println("Carro acelerou");
    }

    @Override
    public void frear() {
        setVelocidadeCarro(getVelocidadeCarro() - 30);
        System.out.println("Carro freiou");
    }

    public int getVelocidadeCarro() {
        return velocidadeCarro;
    }

    public void setVelocidadeCarro(int velocidadeCarro) {
        this.velocidadeCarro = velocidadeCarro;
    }

    @Override
    public void verificar() {
        System.out.println("A velocidade atual é: "+getVelocidadeCarro());
    }
    
}
