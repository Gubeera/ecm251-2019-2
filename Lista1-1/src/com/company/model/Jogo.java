package com.company.model;

public class Jogo {
    public String nome,genero,plataforma,lancamento;
    public int id;

    public Jogo(){
        id=-1;
    }

    public Jogo(String nome, String genero, String plataforma, String lancamento, int id) {
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
        this.lancamento = lancamento;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", lancamento='" + lancamento + '\'' +
                ", id=" + id +
                '}';
    }
}
