 package com.mycompany.exconstrutor;

public class contato {
    private pessoa pessoaContato;
    private endereco enderecoContato;
    
    contato(){
    pessoaContato = new pessoa();
    enderecoContato = new endereco();
    }
    
    private int numeroCelular;
    private String email;
    
    public void inserir(String nome, int idade, String rua, int num, int cep, int numeroCelular, String email){
      pessoaContato.setNome(nome);
      pessoaContato.setIdade(idade);
      enderecoContato.setRua(rua);
      enderecoContato.setNum(num);
      enderecoContato.setCep(cep);
      setNumeroCelular(numeroCelular);
      setEmail(email);
    }
    
    public void imprimirDados(){
        System.out.println("Nome: "+pessoaContato.getNome()+"    Idade: "+pessoaContato.getIdade()+"    Rua: "+enderecoContato.getRua()+"    Número da Casa: "+enderecoContato.getNum()+"    Cep: "+enderecoContato.getCep()+"    Número Celular: "+getNumeroCelular()+"    Email: "+getEmail());
    }

    public int getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(int numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
