package estruturas.condicional;

import java.util.Scanner;

public class Condicional4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.println("Informe a hora inicial do jogo: ");
        horaInicial = input.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        horaFinal = input.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.printf("O jogo durou " + duracao + " Horas!");

        input.close();
    }
}
