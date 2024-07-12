package vectors;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int pessoas;
        double alturatotal = 0;
        int menoresDeIdade = 0;

        System.out.println("Digite o número de pessoas: ");
        pessoas = input.nextInt();

        String[] nome = new String[pessoas];
        int[] idade = new int[pessoas];
        double[] altura = new double[pessoas];

        for (int i = 0; i < pessoas; i++) {
            input.nextLine();
            System.out.printf("Dados da %dª pessoa: ", (i + 1));
            System.out.println("\nNome: ");
            nome[i] = input.next();
            System.out.println("Idade: ");
            idade[i] = input.nextInt();
            System.out.println("Altura: ");
            altura[i] = input.nextDouble();

        }

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                menoresDeIdade++;
            }
            alturatotal = alturatotal + altura[i];
        }

        double media = alturatotal / pessoas;
        double porcentagem = (menoresDeIdade * 100.0) / pessoas;

        System.out.printf("Altura Média: %n%.2f ", media);
        System.out.printf("\nPorcentagem de Menores de 16 Anos: %.1f%%", porcentagem);
        System.out.println();

        for (int i = 0; i < nome.length; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }

        input.close();
    }
}
