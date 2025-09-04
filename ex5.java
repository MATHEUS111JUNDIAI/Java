//Matheus De Oliveira

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroN = leitor.nextInt();

        System.out.println();

        int count = 1;

        for (int i = 1; i <= numeroN; i++) {

            count= count * i;

        }

        System.out.println("O produto de todos os numeros naturais n é = " + count);

        leitor.close();
    }
}