//Matheus De Oliveira


import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numeroN = leitor.nextInt();

        System.out.println();

        for (int i = 0; i <= numeroN; i++) {

            System.out.println(i);
        }

        leitor.close();
    }
}