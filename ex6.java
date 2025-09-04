//Matheus De Oliveira

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero_1 = leitor.nextInt();

        System.out.println("Digite um número: ");
        int numero_2 = leitor.nextInt();

        System.out.println("Digite um número: ");
        int numero_3 = leitor.nextInt();

        System.out.println();

        if (numero_1 >= numero_2 && numero_1 >= numero_3) {
            System.out.print("A ordem Decrescente é: " + numero_1);

            if (numero_2 >= numero_3) {
                System.out.println(" " + numero_2 + " " + numero_3);
            } else {
                System.out.println(" " + numero_3 + " " + numero_2);
            }
        }

        else if (numero_2 >= numero_1 && numero_2 >= numero_3) {
            System.out.print("A ordem Decrescente é: " + numero_2);

            if (numero_1 >= numero_3) {
                System.out.println(" " + numero_1 + " " + numero_3);
            } else {
                System.out.println(" " + numero_3 + " " + numero_1);
            }
        }

        else {
            System.out.print("A ordem Decrescente é: " + numero_3);

            if (numero_1 >= numero_2) {
                System.out.println(" " + numero_1 + " " + numero_2);
            } else {
                System.out.println(" " + numero_2 + " " + numero_1);
            }
        }

        leitor.close();
    }
}