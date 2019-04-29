package com.company.ListadeCompras;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto>lista;


    public ListaDeCompras(){
        lista = new ArrayList<Produto>();
    }


    public boolean AdicionarProduto(Produto p){
        if(p==null) return false;
        lista.add(p);
        return true;
    }

    public boolean Remover(String nome){
        return lista.remove(new Produto(nome));

    }
}
