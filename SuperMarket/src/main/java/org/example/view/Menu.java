package org.example.view;

import org.example.control.CarrinhoControl;
import org.example.control.CompraControl;
import org.example.control.ContaControl;
import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private CarrinhoControl carrinhoControl;
    private ContaControl contaControl;
    private CompraControl compraControl;

    public Menu(CarrinhoControl carrinhoControl, ContaControl contaControl, CompraControl compraControl) {
        this.scanner = new Scanner(System.in);
        this.carrinhoControl = carrinhoControl;
        this.contaControl = contaControl;
        this.compraControl = compraControl;
    }

    public void iniciar() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== SISTEMA DE COMPRAS ===");
            System.out.println("1. Administrar Conta");
            System.out.println("2. Administrar Carrinho");
            System.out.println("3. Efetuar Compra");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
                processarOpcao(opcao);
            } else {
                System.out.println("Por favor, digite apenas números.");
                scanner.next();
            }
        }
    }

    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                MenuConta menuConta = new MenuConta(contaControl, scanner);
                menuConta.exibirMenu();
                break;
            case 2:
                MenuCarrinho menuCarrinho = new MenuCarrinho(carrinhoControl, scanner);
                menuCarrinho.exibirMenu();
                break;
            case 3:
                System.out.println("\n=== CHECKOUT ===");
                compraControl.efetuarCompra();
                break;
            case 0:
                System.out.println("Encerrando sistema...");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}