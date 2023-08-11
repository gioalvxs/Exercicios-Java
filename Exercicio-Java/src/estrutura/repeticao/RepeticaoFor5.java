package estrutura.repeticao;

import java.util.Scanner;

public class RepeticaoFor5 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n;
        int fatorial = 1;

        System.out.println("Informe um número: ");
        n = input.nextInt();

        for(int i = 1; i <= n ; i++){
            fatorial *= i;
        }
        System.out.println(fatorial);
    }
}
