package estruturas.repeticao;

import java.util.Scanner;

public class RepeticaoWhile3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int cod;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        System.out.println("Informe o tipo de combustivél abastecido:\n 1.Álcool\n 2.Gasolina\n 3.Diesel \n 4.Fim");
        cod = input.nextInt();

        while ( cod != 4){

            System.out.println("Informe o tipo de combustivél abastecido:\n 1.Álcool\n 2.Gasolina\n 3.Diesel \n 4.Fim");
            cod = input.nextInt();

            if(cod == 1){
                alcool += 1;
            } else if (cod == 2) {
                gasolina += 1;
            } else if (cod == 3) {
                diesel += 1;
            }
            System.out.println("MUITO OBRIGADA");
            System.out.println("Alcoól: " + alcool);
            System.out.println("Gasolina: " + gasolina);
            System.out.println("Diesel: " + diesel);
        }
        input.close();
    }
}
