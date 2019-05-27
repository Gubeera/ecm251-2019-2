package com.usuario;

public class User extends Base {
    protected String nome;
    protected String senha;


    public User(String nome, String senha){
        super.nome = nome;
        super.senha = senha;
    }

    @Override
    public String toString() {
        return super.nome;
    }
}
