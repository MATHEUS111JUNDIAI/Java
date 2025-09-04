//Matheus De Oliveira

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();

        System.out.println();

        int resto = (numero % 2);

        System.out.println("o resto da divisao inteira é de:  " + resto + "");

        leitor.close();

    }
}
