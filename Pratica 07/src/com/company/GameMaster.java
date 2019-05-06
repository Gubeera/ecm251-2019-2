package com.company;

public class GameMaster extends Usuario {
    public GameMaster(String nome,String senha,String email){
        super(nome,email,senha);
    }

    @Override
    public boolean autentica(String senha) {
        return senha.equals(this.senha);
    }
}
