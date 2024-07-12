package vectors;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeros;
        double numeroMaior = 0;
        int posicao = 0;
        System.out.println("Quantos números terá essa operação? ");
        numeros = input.nextInt();

        double[] vetor = new double[numeros];

        for (int i = 0; i < numeros; i++) {

            System.out.println("Digite um número: ");
            vetor[i] = input.nextDouble();

        }

        System.out.println("NÚMERO MAIOR: ");

        for (int i = 0; i < vetor.length; i++) {

            if (vetor[i] > numeroMaior) {
                numeroMaior = vetor[i];
                posicao = i;
            }
        }
        System.out.printf("%.1f ", numeroMaior);
        System.out.printf("\nPOSIÇÃO DO MAIOR NÚMERO = %s ", posicao);

        input.close();
    }
}
