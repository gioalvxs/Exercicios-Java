package estruturas.repeticao;

import java.util.Scanner;

public class RepeticaoFor7 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n;
        int primeiro;
        int segundo;
        int terceiro;

        System.out.println("Informe um número: ");
        n = input.nextInt();

        for( int i = 0 ; i <= n ; i++ ){

              primeiro = i;
              segundo = i * i;
              terceiro = i * i * i;

            System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);

        }
        input.close();
    }
}
