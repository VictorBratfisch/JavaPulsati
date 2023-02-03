package com.mycompany.bancocominterface;

public class BancoComInterface {

    public static void main(String[] args) {
        contaEspecial conta = new contaEspecial();
        conta.setLimite(300);
        conta.setSaldo(300);
        
        conta.sacar(600.01);
    }
}
