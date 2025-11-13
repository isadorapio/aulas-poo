import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno[] alunos = new Aluno[10];
        double somaNotas = 0;

        for (int i = 0; i < alunos.length; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alunos[i] = new Aluno(nome, nota);
            somaNotas += nota;
        }

        double media = somaNotas / alunos.length;
        System.out.println("\nMédia da turma: " + media);

        System.out.println("\nAlunos aprovados:");
        for (Aluno a : alunos) {
            if (a.getNota() >= 6.0) {
                System.out.println(a.getNome() + " - Nota: " + a.getNota());
            }
        }

        System.out.println("\nAlunos reprovados:");
        for (Aluno a : alunos) {
            if (a.getNota() < 6.0) {
                System.out.println(a.getNome() + " - Nota: " + a.getNota());
            }
        }

        sc.close();
    }
}