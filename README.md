# 🛒 Carrinho de Compras

Este repositório contém um projeto simples de **Carrinho de Compras** desenvolvido em Java, utilizando a estrutura de projeto Maven. O objetivo principal é aplicar e consolidar conhecimentos em Programação Orientada a Objetos (POO) e organização de código, seguindo o padrão de arquitetura **Model-View-Controller (MVC)**.

## 🌟 Funcionalidades

O projeto simula as operações básicas de um sistema de carrinho de compras, incluindo:

*   **Adicionar Produtos:** Inclusão de novos itens (`Compra`) no carrinho.
*   **Visualizar Carrinho:** Exibição de todos os itens atualmente no carrinho.
*   **Remover Produtos:** Remoção de itens específicos do carrinho por índice.
*   **Cálculo de Total:** Determinação do valor total dos produtos no carrinho.
*   **Controle de Saldo:** Gerenciamento do saldo da conta do usuário (`Conta`).
*   **Finalização de Compra:** Lógica para efetuar a compra, verificando se o saldo é suficiente para cobrir o valor total do carrinho.

## 🛠️ Estrutura do Projeto

O projeto está organizado em pacotes que refletem o padrão MVC, facilitando a separação de responsabilidades:

| Pacote | Responsabilidade | Classes Principais |
| :--- | :--- | :--- |
| `model` | Contém as classes de dados e a lógica de negócios. | `CarrinhoCompras.java`, `Compra.java`, `Conta.java` |
| `control` | Contém a lógica de controle e manipulação dos dados. | `CarrinhoControl.java`, `CompraControl.java`, `ContaControl.java` |
| `view` | Contém a interface com o usuário (atualmente, classes para exibição de menu e interação via console). | `Menu.java`, `MenuCarrinho.java`, `MenuCompra.java` |

A classe principal de execução é `Main.java`, localizada em `SuperMarket/src/main/java/org/example/`.

## 🚀 Como Executar

Este é um projeto Maven. Para executá-lo, você precisará ter o **Java Development Kit (JDK)** e o **Maven** instalados em sua máquina.

1.  **Clone o repositório:**
    ```bash
    git clone https://github.com/eduuardo1st/Carrinho_De_Compras.git
    cd Carrinho_De_Compras/SuperMarket
    ```

2.  **Compile o projeto:**
    ```bash
    mvn clean install
    ```

3.  **Execute a aplicação:**
    ```bash
    mvn exec:java -Dexec.mainClass="org.example.Main"
    ```

Alternativamente, você pode importar o projeto para sua IDE favorita (como IntelliJ IDEA, Eclipse ou VS Code) e executá-lo diretamente a partir da classe `Main.java`.

## 🤝 Contribuição

Contribuições são bem-vindas! Se você tiver sugestões de melhoria, novas funcionalidades ou correções de bugs, sinta-se à vontade para abrir uma *issue* ou enviar um *pull request*.

## 📄 Licença

Este projeto está licenciado sob a Licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.
