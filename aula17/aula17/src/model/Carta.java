package model;

public class Carta {
    public String dono, nome, tipo, colection;
    public int number, id;

    public Carta(String dono, String nome, String tipo, String colection, int number, int id) {
        this.dono = dono;
        this.nome = nome;
        this.tipo = tipo;
        this.colection = colection;
        this.number = number;
        this.id = id;
    }

    public Carta( ) {

    }

    @Override
    public String toString() {
        return "card{" + "\n" + "dono = " + dono + "\n" + "nome = " + nome + "\n" + "tipo = " + tipo + "\n" + "collection = " + colection + "\n" + "number = " + number + "\n" + "id = " + id + "}";
    }
}
