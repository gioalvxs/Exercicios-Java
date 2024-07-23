package vectors;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int pessoas;
        int maisVelho = 0;
        System.out.println("Quantas pessoas você vai digitar? ");
        pessoas = input.nextInt();

        String[] nome = new String[pessoas];
        int[] idade = new int[pessoas];

        for (int i = 0; i < pessoas; i++) {
            input.nextLine();
            System.out.printf("Informe os dados da %sª pessoa: ", (i + 1));
            System.out.println("\nNome: ");
            nome[i] = input.nextLine();
            System.out.println("Idade: ");
            idade[i] = input.nextInt();

        }

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > maisVelho) {

                maisVelho = idade[i];

            }
        }

        for (int i = 0; i < nome.length; i++) {
            if (idade[i] == maisVelho) {
                System.out.printf("Pessoa mais velha: %s", nome[i]);
            }
        }

    }
}
