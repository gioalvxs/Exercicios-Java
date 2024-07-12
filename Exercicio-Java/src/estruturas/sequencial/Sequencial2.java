package estruturas.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial2 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double raio;
        double PI = 3.14159;

        System.out.println("Informe o número do raio: ");
        raio = input.nextDouble();

        double area = PI * Math.pow(raio,2);

        System.out.printf("A area deste círculo é igual A = %.4f" , area);

        input.close();
    }
}
