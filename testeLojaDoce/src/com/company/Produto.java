package com.company;
public class Produto {
        private double preco;
        private String nome;
        private int id;

    public Produto(int id, double preco, String nome){
        this.id = id;
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }
}


