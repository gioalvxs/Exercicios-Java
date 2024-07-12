package estruturas.sequencial;

import java.util.Scanner;

public class Sequencial3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A, B, C, D;

        System.out.println("Informe o valor de A: ");
        A = input.nextInt();
        System.out.println("Informe o valor de B: ");
        B = input.nextInt();
        System.out.println("Informe o valor de C: ");
        C = input.nextInt();
        System.out.println("Informe o valor de D: ");
        D = input.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.println("DIFERENÇA = " + DIFERENCA);

        input.close();
    }
}
