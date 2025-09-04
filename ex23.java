//Matheus De Oliveira

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o numero x: ");
        int x = leitor.nextInt();

        System.out.println("Digite o numero y: ");
        int y = leitor.nextInt();

        if (y == 0) {
            System.out.println("Nao é possível dividir nenhum numero por 0");

            System.out.println();

            int soma = x + y;
            int subtracao = x - y;
            int multiplicacao = x * y;

            System.out.println("A soma será: " + soma + " A subtração será: " + subtracao + " A multiplicação será: "
                    + multiplicacao + " A divisão não existe!");

        } else {
            int soma = x + y;
            int subtracao = x - y;
            int multiplicacao = x * y;
            float divisao = x / y;

            System.out.println("A soma será: " + soma + " A subtração será: " + subtracao + " A multiplicação será: "
                    + multiplicacao + " A divisão será: " + divisao);
        }

        leitor.close();
    }

}