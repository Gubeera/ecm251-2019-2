package com.company;

public class MinhaClasse {
    private int valor;
    private String nome;

    public MinhaClasse(int valor, String nome){
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString(){
        return nome + '\t' + valor;
    }

    }

