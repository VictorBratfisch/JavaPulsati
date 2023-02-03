package com.mycompany.exercicio4pilares;

public class moto extends veiculo {
    private int retrovisores;

    public int getRetrovisores() {
        return retrovisores;
    }

    public void setRetrovisores(int retrovisores) {
        this.retrovisores = retrovisores;
    }

    @Override
    public void imprime() {
        System.out.println("A moto tem capacidade para "+getQuantidadePassageiros()+" passageiros, tem a velocidade máxima de "+getVelocidade()+" e tem "+getRetrovisores()+" retrovisores");
    }
}
