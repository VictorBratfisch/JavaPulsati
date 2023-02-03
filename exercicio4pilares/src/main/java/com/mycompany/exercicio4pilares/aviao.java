package com.mycompany.exercicio4pilares;

public class aviao extends veiculo {
    private int janelas;

    public int getJanelas() {
        return janelas;
    }

    public void setJanelas(int janelas) {
        this.janelas = janelas;
    }

    @Override
    public void imprime() {
        System.out.println("O avião tem capacidade para "+getQuantidadePassageiros()+" passageiros, tem a velocidade máxima de "+getVelocidade()+" e tem "+getJanelas()+" janelas");
    }
}
