package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int cod1, num1, cod2, num2;
        double valor1, valor2, total;

        System.out.println("Código da peça: ");
        cod1 = input.nextInt();
        System.out.println("Número de peças: ");
        num1 = input.nextInt();
        System.out.println("Valor Unitário: ");
        valor1 = input.nextDouble();
        System.out.println("Código a segunda peça: ");
        cod2 = input.nextInt();
        System.out.println("Número de peças: ");
        num2 = input.nextInt();
        System.out.println("Valor Unitário: ");
        valor2 = input.nextDouble();

        total = (num1 * valor1 + num2 * valor2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);

        input.close();
    }
}
