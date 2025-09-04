//Matheus De Oliveira

import java.util.Scanner;

public class ex14 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da primeira reta: ");
        float retA1 = leitor.nextFloat();

        System.out.println("Digite o valor da segunda reta: ");
        float retA2 = leitor.nextFloat();

        System.out.println("Digite o valor da terceira reta: ");
        float retA3 = leitor.nextFloat();

        System.out.println();

        if (retA1 != retA2 && retA1 != retA3 && retA2 != retA3) {
            System.out.println("O seu triângulo é escaleno, com todos os lados diferentes: " + retA1 + ", " + retA2
                    + " e " + retA3);
        } else if (retA1 == retA2 && retA2 == retA3) {
            System.out.println("O seu triângulo é um equilatero, com todos os lados iguais: " + retA1 + ", " + retA2
                    + " e " + retA3);
        } else {
            System.out.println(
                    "O seu triângulo é isoceles, com dois lados iguais: " + retA1 + ", " + retA2 + " e " + retA3);
        }

        leitor.close();
    }
}
