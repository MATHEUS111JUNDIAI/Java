//Matheus De Oliveira

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroN = leitor.nextInt();

        System.out.println();

        int count = 0;

        for (int i = 0; i <= numeroN; i++) {

            count= count + i;

        }

        System.out.println("A soma de todos os numeros naturais até n é = " + count);

        leitor.close();
    }
}