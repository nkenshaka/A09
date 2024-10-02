import java.util.Scanner;

public class Cardapio {

    private static final int LIM_REG = 100;
    private static final String[][] produtos = new String[LIM_REG][4]; // [Código, Produto, Ativo, Preço]
    private static final String[][] clientes = new String[LIM_REG][7]; // [Nome, Endereço, Número, Bairro, Cidade, CEP, Estado]
    private static int totalProdutos = 0;
    private static int totalClientes = 0;
    private static Scanner entradaDados = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            exibirMenuPrincipal();
            opcao = entradaDados.nextInt();
            entradaDados.nextLine();

            switch (opcao) {
                case 1: menuCadastroProduto(); break;
                case 2: imprimirCardapio(); break;
                case 3: menuCadastroCliente(); break;
                case 4: System.out.println("Saindo do sistema..."); break;
                default: System.out.println("Opção inválida!");
            }
        } while (opcao != 4);
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\nMenu Principal:");
        System.out.println("1. Cadastro de Produtos");
        System.out.println("2. Imprimir Cardápio");
        System.out.println("3. Cadastro de Clientes");
        System.out.println("4. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void menuCadastroProduto() {
        System.out.println("\nCadastro de Produtos:");
        System.out.println("1. Incluir Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Excluir Produto");
        System.out.println("4. Consultar Produto");
        System.out.print("Escolha uma opção: ");
        int opcao = entradaDados.nextInt();
        entradaDados.nextLine();

        switch (opcao) {
            case 1: incluirProduto(); break;
            case 2: alterarProduto(); break;
            case 3: excluirProduto(); break;
            case 4: consultarProduto(); break;
            default: System.out.println("Opção inválida!");
        }
    }

    private static void incluirProduto() {
        if (totalProdutos >= LIM_REG) {
            System.out.println("Cadastro de produtos cheio.");
            return;
        }

        System.out.print("Código (6 caracteres): ");
        String codigo = entradaDados.nextLine();
        System.out.print("Produto: ");
        String produto = entradaDados.nextLine();
        System.out.print("Preço: ");
        double preco = entradaDados.nextDouble();
        entradaDados.nextLine(); // Limpar o buffer
        System.out.print("Ativo (true/false): ");
        String ativo = entradaDados.nextLine();

        produtos[totalProdutos][0] = codigo;
        produtos[totalProdutos][1] = produto;
        produtos[totalProdutos][2] = ativo;
        produtos[totalProdutos][3] = String.format("%.2f", preco);
        totalProdutos++;

        System.out.println("Produto cadastrado com sucesso.");
    }

    private static void alterarProduto() {
        System.out.print("Digite o código do produto a alterar: ");
        String codigo = entradaDados.nextLine();

        for (int i = 0; i < totalProdutos; i++) {
            if (produtos[i][0].equals(codigo)) {
                System.out.print("Novo Produto: ");
                produtos[i][1] = entradaDados.nextLine();
                System.out.print("Novo Preço: ");
                produtos[i][3] = String.format("%.2f", entradaDados.nextDouble());
                entradaDados.nextLine(); // Limpar o buffer
                System.out.print("Ativo (true/false): ");
                produtos[i][2] = entradaDados.nextLine();
                System.out.println("Produto alterado com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void excluirProduto() {
        System.out.print("Digite o código do produto a excluir: ");
        String codigo = entradaDados.nextLine();

        for (int i = 0; i < totalProdutos; i++) {
            if (produtos[i][0].equals(codigo)) {
                for (int j = i; j < totalProdutos - 1; j++) {
                    produtos[j] = produtos[j + 1];
                }
                totalProdutos--;
                System.out.println("Produto excluído com sucesso.");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void consultarProduto() {
        System.out.print("Digite o código do produto: ");
        String codigo = entradaDados.nextLine();

        for (int i = 0; i < totalProdutos; i++) {
            if (produtos[i][0].equals(codigo)) {
                System.out.printf("Código: %s, Produto: %s, Preço: R$%s, Ativo: %s%n",
                        produtos[i][0], produtos[i][1], produtos[i][3], produtos[i][2]);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    private static void menuCadastroCliente() {
        System.out.println("\nCadastro de Clientes:");
        System.out.println("1. Incluir Cliente");
        System.out.println("2. Consultar Cliente");
        System.out.print("Escolha uma opção: ");
        int opcao = entradaDados.nextInt();
        entradaDados.nextLine();

        switch (opcao) {
            case 1: incluirCliente(); break;
            case 2: consultarCliente(); break;
            default: System.out.println("Opção inválida!");
        }
    }

    private static void incluirCliente() {
        if (totalClientes >= LIM_REG) {
            System.out.println("Cadastro de clientes cheio.");
            return;
        }

        System.out.print("Nome: ");
        clientes[totalClientes][0] = entradaDados.nextLine();
        System.out.print("Endereço: ");
        clientes[totalClientes][1] = entradaDados.nextLine();
        System.out.print("Número: ");
        clientes[totalClientes][2] = entradaDados.nextLine();
        System.out.print("Bairro: ");
        clientes[totalClientes][3] = entradaDados.nextLine();
        System.out.print("Cidade: ");
        clientes[totalClientes][4] = entradaDados.nextLine();
        System.out.print("CEP: ");
        clientes[totalClientes][5] = entradaDados.nextLine();
        System.out.print("Estado: ");
        clientes[totalClientes][6] = entradaDados.nextLine();

        totalClientes++;
        System.out.println("Cliente cadastrado com sucesso.");
    }

    private static void consultarCliente() {
        System.out.print("Digite o nome do cliente: ");
        String nome = entradaDados.nextLine();

        for (int i = 0; i < totalClientes; i++) {
            if (clientes[i][0].equalsIgnoreCase(nome)) {
                System.out.printf("Nome: %s, Endereço: %s, Número: %s, Bairro: %s, Cidade: %s, CEP: %s, Estado: %s%n",
                        clientes[i][0], clientes[i][1], clientes[i][2], clientes[i][3], clientes[i][4], clientes[i][5], clientes[i][6]);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }

    private static void imprimirCardapio() {
        System.out.println("CÓDIGO   PRODUTO                     VALOR");
        for (int i = 0; i < totalProdutos; i++) {
            if (produtos[i][2].equals("true")) {
                System.out.printf("%-8s %-30s %6s%n", produtos[i][0], produtos[i][1], produtos[i][3]);
            }
        }
    }
}
