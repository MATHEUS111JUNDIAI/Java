//Matheus De Oliveira

import java.util.Scanner;

public class ex11 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero_1 = leitor.nextInt();

        System.out.println("Digite um número: ");
        int numero_2 = leitor.nextInt();

        if (numero_1 % numero_2 == 0) {

            System.out.println("O número: " + numero_1 + " é divisivel por: " + numero_2);
        } else {
            System.out.println("O número: " + numero_1 + " é divisivel por: " + numero_2);
        }

        leitor.close();

    }
}