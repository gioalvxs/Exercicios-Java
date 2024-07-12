package estruturas.sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Sequencial4 {
        public static void main(String[] args){
            Locale.setDefault(Locale.US);
            Scanner input = new Scanner(System.in);
            int numFuncionario;
            double horas, valorHora;

            System.out.println("Informe o número do Funcionário:");
            numFuncionario = input.nextInt();
            System.out.println("Informe o número de horas trabalhadas: ");
            horas = input.nextDouble();
            System.out.println("Informe o valor da hora trabalhada: ");
            valorHora = input.nextDouble();

            double salario = horas * valorHora;

            System.out.print("NUMBER = " + numFuncionario);
            System.out.printf("\nSALARY = U$ %.2f", salario);

            input.close();
        }
}
