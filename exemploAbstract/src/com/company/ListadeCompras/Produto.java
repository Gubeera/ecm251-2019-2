package com.company.ListadeCompras;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil;

public class Produto {
    private String nome;

    public Produto(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return nome;
    }
    @Override
    public boolean equals(Object obj){
        return this.nome.equals(obj.toString());
    }
}
