package com.mycompany.exercicioconta;

public class contaEspecial extends conta {

    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void deposito(double valor) {
        if (getSaldo() > 0) {
            setSaldo(getSaldo() + valor);
        } else {
            System.out.println("Não é possível fazer o depósito");
        }
    }

    @Override
    public boolean saque(double valor) {
        if (valor > getSaldo() || valor > getLimite() || valor <= 0) {
            System.out.println("Não é possível fazer o saque");
            return false;
        } else {
            setSaldo(getSaldo() - valor);
            return true;
        }
    }

    @Override
    public void transf(conta pagar, conta receber, double valor) {
        var result = pagar.saque(valor);
        if (result) {
            receber.deposito(valor);
            System.out.println(pagar.getNomeTitular() + " você transferiu " + valor + " para " + receber.getNomeTitular());
        }
    }
}
