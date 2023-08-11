package estrutura.repeticao;

import java.util.Scanner;

public class RepeticaoFor2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n = 0;
        int in = 0;
        int out = 0;

        System.out.println("Informe um número: ");
        n = input.nextInt();

        for(int i = 0; i < n; i++){
            System.out.printf("informe mais números: ");
           int x = input.nextInt();

            if( x >= 10 && x <= 20 ) {
               in += 1;
            }
            else {
                out += 1;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");

        input.close();
    }
}
