import java.util.Scanner;

class Produto {
    private String nome;
    private int codigo;
    private int quantidade;

    public Produto(String nome, int codigo, int quantidade) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade em estoque: " + quantidade);
        if (quantidade < 10) {
            System.out.println("Atenção: Produto precisa ser reabastecido!");
        }
        System.out.println("-----------------------------");
    }
}

