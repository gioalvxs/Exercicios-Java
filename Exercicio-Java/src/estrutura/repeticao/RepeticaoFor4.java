package estrutura.repeticao;

import java.util.Locale;
import java.util.Scanner;

public class RepeticaoFor4 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n;
        double numerador;
        double denominador;
        double divisao;

        System.out.println("Informe a quantidade de vezes que você quer fazer a divisão: ");
        n = input.nextInt();

        for(int i = 0; i < n ; i++){

            System.out.println("Primeiro número: ");
            numerador = input.nextInt();

            System.out.println("Segundo número: ");
            denominador = input.nextInt();

            if(denominador == 0){

                System.out.println("Divisão Impossível \uD83D\uDE41");

            } else {

                divisao = numerador / denominador;
                System.out.println("Resultado: " + divisao);

            }
        }
        input.close();
    }
}
