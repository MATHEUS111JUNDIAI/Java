//Matheus De Oliveira

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o coeficiente a: ");
        double coefA = leitor.nextDouble();

        System.out.println("Digite o coeficiente b: ");
        double coefB = leitor.nextDouble();

        System.out.println("Digite o coeficiente c: ");
        double coefC = leitor.nextDouble();

        double resultado = Math.pow(coefB, 2);
        double delta = resultado - 4 * coefA * coefC;

        System.out.println("O valor de delta é: " + delta);

        leitor.close();
    }

}