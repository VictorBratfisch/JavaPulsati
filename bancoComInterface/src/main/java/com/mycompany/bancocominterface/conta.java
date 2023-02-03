package com.mycompany.bancocominterface;

public class conta {
    private String nomeTitular;
    private int idadeTitular;
    private double saldo;
    private int numConta;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getIdadeTitular() {
        return idadeTitular;
    }

    public void setIdadeTitular(int idadeTitular) {
        this.idadeTitular = idadeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
}
