//Matheus De Oliveira

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println("O número " + numero + " é primo!");
        } else {
            System.out.println("O número " + numero + " não é primo.");
        }

        leitor.close();
    }
}