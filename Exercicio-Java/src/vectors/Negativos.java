package vectors;

import java.util.Locale;
import java.util.Scanner;
import java.util.Vector;

public class Negativos {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("Quantidade de números que serão digitados: ");
        n = input.nextInt();

        int[] vect = new int[n];

        for (int i=0; i< vect.length; i++){

            System.out.println("Digite um número: ");
            vect[i] = input.nextInt();

            }

        System.out.println("Os Números Negativos são: ");

        for(int i = 0; i<vect.length; i++){

            if(vect[i] < 0){
                System.out.println(vect[i]);

            }
        }
        input.close();
    }
}
