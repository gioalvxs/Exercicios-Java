package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoFor3 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double a, b, c;
        double media;

        System.out.println("Informe o número de testes: ");
        n = input.nextInt();

        for (int i = 0; i < n ; i++){

            System.out.println("Informe primeira média: ");
            a = input.nextDouble();

            System.out.println("Informe segunda média: ");
            b = input.nextDouble();

            System.out.println("Informe terceira média: ");
            c = input.nextDouble();

            media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

            System.out.printf("\n%.1f%n", media);
        }

        input.close();
    }
}
