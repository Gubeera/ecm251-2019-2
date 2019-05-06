package com.company;

public class Player extends Usuario implements Autenticar {
    public Player(String nome,String senha,String email){
        super(nome,email,senha);
    }

    @Override
    public boolean autentica(String senha) {
        return senha.equals(this.senha);
    }
}
