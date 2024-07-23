package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRent {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented? ");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            input.nextLine();
            System.out.println("RENT #" + i + ":\nName:");
            String name = input.nextLine();
            System.out.println("E-mail: ");
            String email = input.next();
            System.out.println("Room: ");
            int quarto = input.nextInt();

            vect[quarto] = new Rent(name, email);

        }
        System.out.println();
        System.out.println("Busy Room: ");
        for (int i = 0; i < 10; i++) {

            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

    }
}
