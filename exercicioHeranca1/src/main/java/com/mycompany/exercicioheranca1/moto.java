package com.mycompany.exercicioheranca1;

public class moto extends veiculo{
    private double comprimentoGuidao;
    private int quantidadeRetrovisor;

    public double getComprimentoGuidao() {
        return comprimentoGuidao;
    }

    public void setComprimentoGuidao(double comprimentoGuidao) {
        this.comprimentoGuidao = comprimentoGuidao;
    }

    public int getQuantidadeRetrovisor() {
        return quantidadeRetrovisor;
    }

    public void setQuantidadeRetrovisor(int quantidadeRetrovisor) {
        this.quantidadeRetrovisor = quantidadeRetrovisor;
    }
    
    @Override
    public void imprime(){
        System.out.println("A moto tem capacidade para "+get.quantidadePassageiros+" passageiros");
    }
}
