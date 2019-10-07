package model;

public class Corno {
    public String nome, senha;
    public int id;

    public Corno(String nome, String senha, int id) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }
    public Corno(){

    }
    @Override
    public String toString() {
        return "corno{" + "\n" + "id = " + id + "\n" + "nome = " + nome + "\n" + "senha = " + senha +"}";
    }

}
