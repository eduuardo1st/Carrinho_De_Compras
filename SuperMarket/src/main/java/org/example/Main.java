package org.example;

import org.example.control.CarrinhoControl;
import org.example.control.CompraControl;
import org.example.control.ContaControl;
import org.example.model.CarrinhoCompras;
import org.example.model.Compra;
import org.example.model.Conta;
import org.example.view.Menu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Compra> listaCompras = new ArrayList<>();

        Conta minhaConta = new Conta();
        CarrinhoCompras meuCarrinho = new CarrinhoCompras(listaCompras);


        ContaControl contaCtrl = new ContaControl(minhaConta);
        CarrinhoControl carrinhoCtrl = new CarrinhoControl(meuCarrinho);

       CompraControl compraCtrl = new CompraControl(contaCtrl, carrinhoCtrl);

        Menu menu = new Menu(carrinhoCtrl, contaCtrl, compraCtrl);

        menu.iniciar();
    }
}