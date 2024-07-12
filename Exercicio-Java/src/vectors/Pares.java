package vectors;

import java.util.Locale;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeros;
        int quantidade = 0;
        System.out.println("Quantos números terá sua operação? ");
        numeros = input.nextInt();
        int[] inteiros = new int[numeros];

        for (int i = 0; i < numeros; i++) {
            System.out.println("Digite um número: ");
            inteiros[i] = input.nextInt();
        }

        System.out.println("NÚMEROS PARES = ");

        for (int i = 0; i < numeros; i++) {
            if (inteiros[i] % 2 == 0) {
                quantidade++;
                System.out.printf("%s ", inteiros[i]);
            }
        }
        System.out.printf("\nQUANTIDADE DE PARES: %s", quantidade);

    }
}
