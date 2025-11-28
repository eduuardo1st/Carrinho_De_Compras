package org.example.view;

import org.example.control.CarrinhoControl;
import org.example.model.Compra;
import java.util.Scanner;

public class MenuCarrinho {
    private CarrinhoControl carrinhoControl;
    private Scanner scanner;

    public MenuCarrinho(CarrinhoControl carrinhoControl, Scanner scanner) {
        this.carrinhoControl = carrinhoControl;
        this.scanner = scanner;
    }

    public void exibirMenu() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- GESTÃO DO CARRINHO ---");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Listar Itens");
            System.out.println("3. Remover Item");
            System.out.println("4. Ver Valor Total");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.print("Opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        adicionarProduto();
                        break;
                    case 2:
                        carrinhoControl.mostrarItensCarrinho();
                        break;
                    case 3:
                        removerProduto();
                        break;
                    case 4:
                        System.out.println("Total atual: R$ " + carrinhoControl.valorCarrinho());
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

    private void adicionarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: R$ ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        Compra novoItem = new Compra(nome, preco);
        carrinhoControl.adicionarAoCarrinho(novoItem);
    }

    private void removerProduto() {
        carrinhoControl.mostrarItensCarrinho();
        System.out.print("Digite o índice para remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();
        carrinhoControl.apagarItensCarrinho(indice);
    }
}