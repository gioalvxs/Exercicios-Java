package estrutura.repeticao;

import java.util.Scanner;

public class RepeticaoWhile1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int senha;

        System.out.println("Informe a senha: ");
        senha = input.nextInt();

        while (senha != 2002) {
            System.out.println("Senha Inválida!");

            System.out.print("Informe a senha: ");
            senha = input.nextInt();
        }
        System.out.println("Acesso permitido!");
        input.close();
    }
}