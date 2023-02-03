package com.mycompany.exercicioheranca1;

public class ExercicioHeranca1 {

    public static void imprimeMsg(veiculo v){
        System.out.println("Quantidade passageiros: "+v.getQuantidadePassageiros());
    }
    public static void main(String[] args) {
        aviao objAviao = new aviao();
        moto objMoto = new moto();
        objAviao.setQuantidadePassageiros(120);
        objMoto.setQuantidadePassageiros(2);
        imprimeMsg(objMoto);
        imprimeMsg(objAviao);
    }
}
