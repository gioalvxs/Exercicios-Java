package estruturas.condicional;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;

        System.out.println("Digite um número: ");
        x = input.nextInt();


        if ( x%2 == 0 ){
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }
        input.close();
    }
}
