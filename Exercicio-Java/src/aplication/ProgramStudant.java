package aplication;

import entities.Studant;

import java.util.Locale;
import java.util.Scanner;

public class ProgramStudant {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        Studant studant = new Studant();

        System.out.println("NAME: ");
        studant.name = input.nextLine();

        System.out.println("FIRST GRADE: ");
        studant.grade1 = input.nextDouble();

        System.out.println("SECOND GRADE: ");
        studant.grade2 = input.nextDouble();

        System.out.println("THRID GRADE: ");
        studant.grade3 = input.nextDouble();

        System.out.println("FINAL GRADE = " + studant);

        input.close();
    }
}
