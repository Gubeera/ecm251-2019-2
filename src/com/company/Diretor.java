package com.company;

public class Diretor extends Funcionario {
    public Diretor(String nome){
        super(nome);
    }
    @Override
    public double comissao(){
        return super.salario;
    }
}
