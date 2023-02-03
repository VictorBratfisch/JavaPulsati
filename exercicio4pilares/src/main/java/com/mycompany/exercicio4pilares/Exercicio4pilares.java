package com.mycompany.exercicio4pilares;

public class Exercicio4pilares {

    
    public static void imprimeVeiculo(veiculo v){
        v.imprime();
    }
    public static void main(String[] args) {
        moto objM = new moto();
        aviao objA = new aviao();
        
        objM.setQuantidadePassageiros(2);
        objM.setVelocidade(200);
        objM.setRetrovisores(2);
        
        objA.setQuantidadePassageiros(120);
        objA.setVelocidade(900);
        objA.setJanelas(60);
        
        imprimeVeiculo(objM);
        imprimeVeiculo(objA);
    }
}
