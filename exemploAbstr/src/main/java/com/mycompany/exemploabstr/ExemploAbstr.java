package com.mycompany.exemploabstr;

public class ExemploAbstr {

    public static void imprimePessoa(pessoa p){
        p.imprime();
    }
    public static void main(String[] args) {
        funcionario objF = new funcionario();
        cliente objC = new cliente();
        
        objC.setNome("Gabriel");
        objC.setIdade(21);
        objC.setCodigoCliente(1212);
        
        objF.setNome("Bianca");
        objF.setIdade(18);
        objF.setCracha(2709);
        
        imprimePessoa(objC);
        imprimePessoa(objF);
    }
}
