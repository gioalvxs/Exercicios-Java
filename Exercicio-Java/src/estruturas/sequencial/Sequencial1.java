package estruturas.sequencial;

import java.util.Scanner;

public class Sequencial1 {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        int num1;
        int num2;

        System.out.println("Informe um número: ");
        num1 = input.nextInt();

        System.out.println("Informe outro número: ");
        num2 = input.nextInt();

        int soma = num1 + num2 ;

        System.out.print("SOMA = " + soma);

        input.close();
    }

}
