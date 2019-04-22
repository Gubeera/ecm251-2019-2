package com.company;

public class Secretario extends Funcionario {
    public Secretario(String nome){
        super(nome);
    }
    @Override
    public double comissao() {
        return 0.1*super.salario;
    }
}
