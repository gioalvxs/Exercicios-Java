package vectors;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int alunos;
        double media = 0;
        double soma = 0;
        System.out.println("Quantidade de Alunos: ");
        alunos = input.nextInt();

        String[] nomes = new String[alunos];
        double[] nota1 = new double[alunos];
        double[] nota2 = new double[alunos];

        for (int i = 0; i < alunos; i++) {
            input.nextLine();
            System.out.printf("Digite o nome, primeira e segunda nota do %sº aluno: ", (i + 1));
            nomes[i] = input.nextLine();
            nota1[i] = input.nextDouble();
            nota2[i] = input.nextDouble();
        }

        for (int i = 0; i < alunos; i++) {
            media = (nota1[i] + nota2[i]) / 2;

            if (media >= 6.0) {
                System.out.printf("Alunos Aprovados: %s", nomes[i]);
            }
        }
    }
}