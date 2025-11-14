import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o nome do produto " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.println("Digite o código do produto " + (i + 1) + ": ");
            int codigo = sc.nextInt();

            System.out.println("Digite a quantidade em estoque do produto " + (i + 1) + ": ");
            int quantidade = sc.nextInt();
            sc.nextLine();

            produtos[i] = new Produto(nome, codigo, quantidade);
        }

        System.out.println("\nDigite o nome ou código do produto que deseja pesquisar: ");
        String pesquisa = sc.nextLine();

        boolean encontrado = false;
        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(pesquisa) ||
                    String.valueOf(p.getCodigo()).equals(pesquisa)) {
                System.out.println("\nProduto encontrado:");
                p.exibirDados();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado!");
        }

        sc.close();
    }
}
