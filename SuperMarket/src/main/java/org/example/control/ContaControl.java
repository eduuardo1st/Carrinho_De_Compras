package org.example.control;

import org.example.model.Conta;

public class ContaControl {
    Conta conta;

    public ContaControl(Conta conta) {
        this.conta = conta;
    }

    public void mostrarSaldoConta() {
        System.out.println("Saldo disponível" + this.conta.getSaldo());
    }

    public void inserirSaldo(double novoSaldo) {
        this.conta.setSaldo(novoSaldo);
        System.out.println("Novo saldo inserido com sucesso!");
    }
}
