package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional8 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salario;

        System.out.println("Informe o salário para calcular a taxa de imposto: R$ ");
        salario = input.nextDouble();

        double taxa;

        if (salario <= 2000.0) {
            taxa = 0.0;
        }
        else if (salario <= 3000.0) {
            taxa = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            taxa = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            taxa = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (taxa == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", taxa);
        }
        input.close();
    }
}
