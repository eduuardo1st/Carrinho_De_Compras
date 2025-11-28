package org.example.control;

import org.example.model.CarrinhoCompras;
import org.example.model.Compra;

public class CarrinhoControl {
    CarrinhoCompras carrinho;

    public CarrinhoControl(CarrinhoCompras carrinho) {
        this.carrinho = carrinho;
    }

    public void adicionarAoCarrinho (Compra produto) {
        this.carrinho.adicionarProdutoListaCompras(produto);
        System.out.println("Produto foi adicionado ao carrinho de compras!");
        System.out.println(this.carrinho.getListaCompras().size() + " itens no carrinho.");
    }

    public void mostrarItensCarrinho () {
        System.out.println("## PRODUTOS NO CARRINH0##");
        System.out.println(this.carrinho.getListaCompras().toString());
    }

    public void apagarItensCarrinho (int indice) {
        if (indice >= 0 && indice <= this.carrinho.getListaCompras().size()){
            this.carrinho.getListaCompras().remove(indice);
            System.out.println("Item removido da lista com sucesso!");
        }
        else {
            System.out.println("Esse objeto não está na lista.");
        }
    }

    public void procurarItem (int indice) { // metodo utilitário
        if (indice >= 0 && indice < this.carrinho.getListaCompras().size()) {
            System.out.println(this.carrinho.getListaCompras().get(indice).toString());
        }
        else {
            System.out.println("Índice inválido! O item não existe.");
        }
    }

    public double valorCarrinho () {
        double valorCarrinho = 0;

        for(Compra produto : carrinho.getListaCompras()){
            valorCarrinho += produto.getValorProduto();
        }

        return valorCarrinho;
    }
}
