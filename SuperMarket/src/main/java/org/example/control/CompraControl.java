package org.example.control;

import org.example.model.CarrinhoCompras;
import org.example.model.Conta;

public class CompraControl {
    ContaControl contaControl;
    CarrinhoControl carrinhoControl;

    public CompraControl(ContaControl contaControl, CarrinhoControl carrinhoControl) {
        this.contaControl = contaControl;
        this.carrinhoControl = carrinhoControl;
    }

    public void efetuarCompra() {
        if (contaControl.conta.getSaldo() < carrinhoControl.valorCarrinho())
        {
            contaControl.inserirSaldo(contaControl.conta.getSaldo() - carrinhoControl.valorCarrinho());
        }
        else {
            System.out.println("Saldo insuficiente para efetuar a compra!");
        }
    }
}
