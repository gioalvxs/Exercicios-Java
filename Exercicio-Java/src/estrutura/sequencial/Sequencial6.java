package estrutura.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        float A, B, C;
        double PI = 3.14159;


        System.out.println("Informe o valor de A: ");
        A = input.nextFloat();
        System.out.println("Informe o valor de B: ");
        B = input.nextFloat();
        System.out.println("Informe o valor de C: ");
        C = input.nextFloat();

        float trianguloRet = A * C / 2;
        double circulo = C * C * PI;
        float trapezio = (A + B) * C / 2;
        float quadrado = B * B;
        float retangulo = A * B;

        System.out.printf("TRIANGULO: %.3f", trianguloRet);
        System.out.printf("\nCIRCULO: %.3f", circulo);
        System.out.printf("\nTRAPÉZIO: %.3f", trapezio);
        System.out.printf("\nQUADRADO: %.3f", quadrado);
        System.out.printf("\nRETÂNGULO: %.3f", retangulo);

        input.close();

    }
}
