//Matheus De Oliveira

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("DIgite qualquer coisa: ");
        String Qcoisa = leitor.nextLine();

        System.out.println("Quantas vezes você quer ver essa mensagem ?");
        int nVezes = leitor.nextInt();

        for (int i = 0; i < nVezes; i++) {

            System.out.println(Qcoisa);
        }

        leitor.close();
    }
}