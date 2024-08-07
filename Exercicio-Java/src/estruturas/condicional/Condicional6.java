package estruturas.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double valor;

        System.out.println("Informe um valor: ");
        valor = input.nextDouble();

        if ( valor < 0.0 || valor > 100.0) {
            System.out.println("Fora do Intervalo!");
        }
        else if (valor <= 25.0) {
            System.out.println("Intervalo: [0,25]");
        }
        else if ( valor <= 50.0) {
            System.out.println("Intervalo (25,50]");
        }
        else if ( valor <= 75.0 ) {
            System.out.println("Intervalo (50, 75]");
        }
        else {
            System.out.println("Intervalo (75, 100]");
        }
        input.close();
    }
}
