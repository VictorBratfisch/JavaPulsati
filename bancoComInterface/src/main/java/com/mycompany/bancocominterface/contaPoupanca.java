package com.mycompany.bancocominterface;

public class contaPoupanca extends conta implements movimentaSaldo{

    @Override
    public void depositar(double valor) {
        this.setSaldo(this.getSaldo()+valor);
    }

    @Override
    public void sacar(double valor) {
        if(this.getSaldo() >= valor){
            this.setSaldo(getSaldo() - valor);
        }
    }
    
}
