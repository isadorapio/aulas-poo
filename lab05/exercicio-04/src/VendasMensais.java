import java.util.Scanner;

public class VendasMensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegistroVenda[] vendas = new RegistroVenda[30];
        double soma = 0;

        for (int i = 0; i < vendas.length; i++) {
            System.out.println("Digite o valor da venda do dia " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            vendas[i] = new RegistroVenda(i + 1, valor);
            soma += valor;
        }

        double media = soma / vendas.length;
        System.out.println("\nTotal de vendas do mês: " + soma);
        System.out.println("Média de vendas do mês: " + media);

        int acima = 0, abaixo = 0;
        System.out.println("\nDias com vendas acima da média:");
        for (RegistroVenda v : vendas) {
            if (v.getValor() > media) {
                System.out.println("Dia " + v.getDia() + " - Valor: " + v.getValor());
                acima++;
            }
        }

        System.out.println("\nDias com vendas abaixo da média:");
        for (RegistroVenda v : vendas) {
            if (v.getValor() < media) {
                System.out.println("Dia " + v.getDia() + " - Valor: " + v.getValor());
                abaixo++;
            }
        }

        System.out.println("\nQuantidade de dias acima da média: " + acima);
        System.out.println("Quantidade de dias abaixo da média: " + abaixo);

        sc.close();
    }
}