package estruturas.condicional;
import java.util.Scanner;

public class Condicional1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int x;

            System.out.print("Informe um número: ");
            x = input.nextInt();

            if (x < 0) {
                System.out.println("NEGATIVO");
            }
            else {
                System.out.println("NÃO NEGATIVO");
            }

            input.close();
        }
}
