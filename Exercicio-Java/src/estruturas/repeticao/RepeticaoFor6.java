package estruturas.repeticao;

import java.util.Scanner;

public class RepeticaoFor6 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = input.nextInt();

        for(int i = 0; i < n ; i++){

            if (n % i == 0){

                System.out.println(i);

            }
            input.close();
        }
    }
}
