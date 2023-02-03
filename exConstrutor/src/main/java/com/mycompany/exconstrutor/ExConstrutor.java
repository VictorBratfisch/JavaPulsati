package com.mycompany.exconstrutor;

public class ExConstrutor {

    public static void main(String[] args) {
        contato objC = new contato();
        objC.inserir("Victor", 19, "Rua Flamengo", 12, 121212, 88029327, "victor@gmail.com");
        objC.imprimirDados();
    }
}
