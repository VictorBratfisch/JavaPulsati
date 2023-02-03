package com.mycompany.exerciciointerface2;

public class caminhao implements veiculo{

    private int velocidadeCaminhao;
    
    caminhao(){
        setVelocidadeCaminhao(velocidade);
    }
    
    @Override
    public void acelerar() {
        setVelocidadeCaminhao(getVelocidadeCaminhao() + 50);
        System.out.println("Caminhão acelerou");
    }

    @Override
    public void frear() {
        setVelocidadeCaminhao(getVelocidadeCaminhao() - 20);
        System.out.println("Caminhão freiou");
    }

    @Override
    public void verificar() {
        System.out.println("A velocidade atual é: "+getVelocidadeCaminhao());
    }

    public int getVelocidadeCaminhao() {
        return velocidadeCaminhao;
    }

    public void setVelocidadeCaminhao(int velocidadeCaminhao) {
        this.velocidadeCaminhao = velocidadeCaminhao;
    }
    
}
