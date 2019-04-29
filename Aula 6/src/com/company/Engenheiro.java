package com.company;

public class Engenheiro extends Funcionario {
    public Engenheiro(String nome) {
        super(nome);
    }
    @Override
    public double comissao() {
        return super.salario;
    }
}
