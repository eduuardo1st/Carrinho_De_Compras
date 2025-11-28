package org.example.view;

import org.example.control.ContaControl;
import java.util.Scanner;

public class MenuConta {
    private ContaControl contaControl;
    private Scanner scanner;

    public MenuConta(ContaControl contaControl, Scanner scanner) {
        this.contaControl = contaControl;
        this.scanner = scanner;
    }

    public void exibirMenu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DE CONTA ---");
            System.out.println("1. Ver Saldo Atual");
            System.out.println("2. Adicionar Fundos");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                System.out.println("------------------------------------");

                switch (opcao) {
                    case 1:
                        contaControl.mostrarSaldoConta();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Valor do depósito: R$ ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();
                        contaControl.inserirSaldo(valor);
                        System.out.println();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                }
            } else {
                scanner.next();
            }
        }
    }
}