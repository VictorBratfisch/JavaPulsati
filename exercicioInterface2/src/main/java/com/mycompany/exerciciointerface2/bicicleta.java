package com.mycompany.exerciciointerface2;

public class bicicleta implements veiculo{

    private int velocidadeBicicleta;
    
    bicicleta(){
        setVelocidadeBicicleta(velocidade);
    }
    
    
    
    @Override
    public void acelerar() {
        setVelocidadeBicicleta(getVelocidadeBicicleta() + 10);
        System.out.println("Bicicleta acelerou");
    }

    @Override
    public void frear() {
        setVelocidadeBicicleta(getVelocidadeBicicleta() - 5);
        System.out.println("Bicicleta freiou");
    }

    @Override
    public void verificar() {
        System.out.println("A velocidade atual é: "+getVelocidadeBicicleta());
    }

    public int getVelocidadeBicicleta() {
        return velocidadeBicicleta;
    }

    public void setVelocidadeBicicleta(int velocidadeBicicleta) {
        this.velocidadeBicicleta = velocidadeBicicleta;
    }
    
}
