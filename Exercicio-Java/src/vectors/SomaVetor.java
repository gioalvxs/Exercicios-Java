package vectors;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double soma = 0;
        double media = 0;

        System.out.println("Quantidade de números que serão digitados: ");
        n = input.nextInt();
        double [] vect = new double[n];

        for(int i=0; i< vect.length; i++){

            System.out.println("Digite um número: ");
            vect[i] = input.nextDouble();

        }

        for (int i = 0; i < vect.length; i++){

            soma += vect[i];

        }
        media = soma /n;

        System.out.print("VALORES = ");

        for (int i = 0; i < vect.length; i++){

            System.out.printf("%.1f ", vect[i]);

        }

        System.out.printf("\nSOMA: %n%.2f", soma);
        System.out.printf("\nMÉDIA: %n%.2f", media);

        input.close();
    }
}
