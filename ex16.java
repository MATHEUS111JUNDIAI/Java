//Matheus De Oliveira

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um numero inteiro na base 10: ");
        int numDecimal = leitor.nextInt();

        System.out.println();

        if (numDecimal >= 0 && numDecimal <= 9) {
            System.out.println("O numero em hexadecimal é: " + numDecimal);
        }

        else {
            StringBuilder resultadoHexadecimal = new StringBuilder();

            int quociente = numDecimal;

            while (quociente > 0) {
                int resto = quociente % 16;

                if (resto == 10) {
                    resultadoHexadecimal.insert(0, "A");
                } else if (resto == 11) {
                    resultadoHexadecimal.insert(0, "B");
                } else if (resto == 12) {
                    resultadoHexadecimal.insert(0, "C");
                } else if (resto == 13) {
                    resultadoHexadecimal.insert(0, "D");
                } else if (resto == 14) {
                    resultadoHexadecimal.insert(0, "E");
                } else if (resto == 15) {
                    resultadoHexadecimal.insert(0, "F");
                } else {
                    resultadoHexadecimal.insert(0, resto);
                }

                quociente = quociente / 16;

            }
            System.out.println("O número " + numDecimal + " em Hexadecimal é:  " + resultadoHexadecimal.toString());
        }

        leitor.close();

    }
}