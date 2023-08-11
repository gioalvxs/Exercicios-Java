package estrutura.condicional;

import java.util.Locale;
import java.util.Scanner;

public class Condicional7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double x;
        double y;

        System.out.println("Informe as coodernadas de x: ");
        x = input.nextDouble();

        System.out.println("Informe as coodernadas de y: ");
        y = input.nextDouble();

        if (x == 0.0 && y == 0.0) {

            System.out.println("ORIGEM");
        } else if (x == 0.0) {

            System.out.println("Eixo Y");

        } else if (y == 0.0) {

            System.out.println("Eixo X");

        } else if (x > 0.0 && y > 0.0) {

            System.out.println("Q1");

        } else if (x < 0.0 && y > 0.0) {

            System.out.println("Q2");

        } else if (x < 0.0 && y < 0.0) {

            System.out.println("Q3");

        } else {

            System.out.println("Q4");

        }
     input.close();
    }
}
