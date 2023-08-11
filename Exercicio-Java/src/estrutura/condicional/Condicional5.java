package estrutura.condicional;

import java.util.Scanner;

public class Condicional5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int codItem;
        int qtd;
        double valorTotal;

        System.out.println("Código do item: ");
        codItem = input.nextInt();

        System.out.println("Quantidade: ");
        qtd = input.nextInt();

        switch (codItem) {
            case 1:
                valorTotal = 4.00 * qtd;
                System.out.printf("Total: R$ %.2f ", valorTotal);
                break;
            case 2:
                valorTotal = 4.50 * qtd;
                System.out.printf("Total: R$ %.2f ", valorTotal);
                break;
            case 3:
                valorTotal = 5.00 * qtd;
                System.out.printf("Total: R$ %.2f ", valorTotal);
                break;
            case 4:
                valorTotal = 2.00 * qtd;
                System.out.printf("Total: R$ %.2f ", valorTotal);
                break;
            case 5:
                valorTotal = 1.50 * qtd;
                System.out.printf("Total: R$ %.2f ", valorTotal);
                break;
            default:
                System.out.println("Código inválido!");
        }
        input.close();
    }
}