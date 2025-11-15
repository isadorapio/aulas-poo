import java.util.Scanner;

public class AnaliseTemperaturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DiaTemperatura[] semana = new DiaTemperatura[7];
        double soma = 0;

        for (int i = 0; i < semana.length; i++) {
            System.out.println("Digite o dia da semana " + (i + 1) + ": ");
            String dia = sc.nextLine();

            System.out.println("Digite a temperatura registrada em " + dia + ": ");
            double temp = sc.nextDouble();
            sc.nextLine();

            semana[i] = new DiaTemperatura(dia, temp);
            soma += temp;
        }

        double media = soma / semana.length;
        System.out.println("\nTemperatura média da semana: " + media);

        DiaTemperatura maisQuente = semana[0];
        DiaTemperatura maisFrio = semana[0];

        for (DiaTemperatura d : semana) {
            if (d.getTemperatura() > maisQuente.getTemperatura()) {
                maisQuente = d;
            }
            if (d.getTemperatura() < maisFrio.getTemperatura()) {
                maisFrio = d;
            }
        }

        System.out.println("Dia mais quente: " + maisQuente.getDiaSemana() + " - " + maisQuente.getTemperatura() + "°C");
        System.out.println("Dia mais frio: " + maisFrio.getDiaSemana() + " - " + maisFrio.getTemperatura() + "°C");

        sc.close();
    }
}