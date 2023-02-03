package com.mycompany.exercicio4pilares;

public abstract class veiculo {
    private double velocidade;
    private int quantidadePassageiros;
    
    public abstract void imprime();

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }
}
