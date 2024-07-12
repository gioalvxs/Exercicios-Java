package estruturas.condicional;

import java.util.Scanner;

public class Condicional3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a, b;

        System.out.println("Digite o primeiro número: ");
        a = input.nextInt();

        System.out.println("Digite o segundo número: ");
        b = input.nextInt();

        if( b % a == 0 || a % b == 0){
            System.out.println("SÃO MULTIPLOS");
        }
        else {
            System.out.println("NÃO SÃO MULTIPLOS");
        }

        input.close();
    }
}
