package estrutura.repeticao;

import java.util.Scanner;

public class RepeticaoFor1 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int x;

        System.out.printf("Informe um número inteiro: ");
        x = input.nextInt();

        for(int i = 0; i <= x; i++){
            if(x % 2 != 0) {
                System.out.println(i);
            }
        }
        input.close();
    }
}
