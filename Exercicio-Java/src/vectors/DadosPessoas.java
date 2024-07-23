package vectors;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int qtdHomens, qtdMulheres;
        double menorAltura, maiorAltura, alturaFem, alturaMedia;

        int n;
        System.out.println("Informe a quantidade de pessoas: ");
        n = input.nextInt();

        double[] altura = new double[n];
        char[] sexo = new char[n];

        for (int i = 0; i < n; i++) {
            input.nextLine();
            System.out.printf("Altura da %dª pessoa: ", (i + 1));
            altura[i] = input.nextDouble();
            System.out.printf("Sexo da %s pessoa: ", (i + 1));
            sexo[i] = input.next().charAt(0);
        }

        menorAltura = altura[0];
        maiorAltura = altura[0];

        for (int i = 0; i < n ; i++) {

            if(altura[i] > maiorAltura){
                maiorAltura = altura[i];
            }
            if(altura[i] < menorAltura){
                menorAltura = altura[i];
            }
        }

        qtdMulheres = 0;
        qtdHomens = 0;
        alturaFem = 0;
        for (int i = 0; i < n; i++) {
            if(sexo[i] == 'M'){
                qtdHomens++;
            } else {
                qtdMulheres++;
                alturaFem = alturaFem + altura[i];
            }
        }

        alturaMedia = alturaFem / qtdMulheres;

        System.out.printf("Menor altura = %.2f\n", menorAltura);
        System.out.printf("Maior altura = %.2f\n", maiorAltura);
        System.out.printf("Média de Alturas Femininas: %.2f\n", alturaMedia);
        System.out.printf("Número de Homens: %d\n", qtdHomens);

        input.close();
    }
}
