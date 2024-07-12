package vectors;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        int soma = 0;
        int pares = 0;
        double media;
        System.out.println("Informe a quantidade de elementos que terá o vetor: ");
        n = input.nextInt();

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                soma = soma + vetor[i];
                pares++;
            }
        }
        if (pares == 0) {
            System.out.println("NENHUM NÚMERO PAR DIGITADO!");
        } else {
            media = soma / pares;
            System.out.printf("MÉDIA DE NÚMEROS PARES: %.1f\n", media);
        }
        input.close();
    }
}
