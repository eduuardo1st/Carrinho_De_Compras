package org.example.model;

import java.util.ArrayList;

public class CarrinhoCompras {
    ArrayList<Compra> listaCompras;

    public CarrinhoCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public ArrayList<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(ArrayList<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public void adicionarProdutoListaCompras (Compra novoProduto) {
        Compra produto = new Compra(novoProduto.getNomeProduto(), novoProduto.getValorProduto());

        this.listaCompras.add(produto);
    }
}
