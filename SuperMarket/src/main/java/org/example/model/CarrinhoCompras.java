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
        this.listaCompras.add(novoProduto);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaCompras.size(); i++) {
            sb.append(i);
            sb.append(" - ");
            sb.append(listaCompras.get(i).toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
