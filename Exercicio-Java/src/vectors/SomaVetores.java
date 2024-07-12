package vectors;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Informe a Quantidade de Elementos dos Vetores: ");
        n = input.nextInt();

        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];

        System.out.println("Digite os Valores do vetor A: ");

        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("Digite os Valores do vetor B: ");

        for (int i = 0; i < n; i++) {
            B[i] = input.nextInt();
        }

        System.out.println("Vetor Resultante: ");

            for (int i = 0; i < n; i++) {
                C[i] = A[i] + B[i];
                System.out.print(C[i] + " ");
            }



    }
}
