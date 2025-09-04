//Matheus De Oliveira

import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro na base 10: ");
        int numDecimal = leitor.nextInt();

        System.out.println();

        if (numDecimal == 0) {
            System.out.println("O numero em binário é: 0");
        }

        else {
            StringBuilder resultadoBinario = new StringBuilder();

            int quociente = numDecimal;

            while (quociente > 0) {
                int resto = quociente % 2;

                resultadoBinario.insert(0, resto);

                quociente = quociente / 2;
            }
            System.out.println("O número " + numDecimal + " em binário é:  " + resultadoBinario.toString());
        }

        leitor.close();

    }
}