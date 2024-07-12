package vectors;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double media = 0;
        double soma = 0;
        System.out.println("Quantos elementos terá o vetor: ");
        n = input.nextInt();

        double[] vetor = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = input.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            soma += vetor[i];
        }
        media = soma / n;
        System.out.printf("MÉDIA DO VETOR: %.3f", media);

        System.out.println("\nELEMENTOS ABAIXO DA MÉDIA: ");


        for (int i = 0; i < n; i++) {
            if (vetor[i] < media) {
                System.out.printf("%.1f ", vetor[i]);
            }
        }
        input.close();
    }
}
