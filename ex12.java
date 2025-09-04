//Matheus De Oliveira

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        float numero_1 = leitor.nextFloat();

        System.out.println("Digite o segundo número:");
        float numero_2 = leitor.nextFloat();

        System.out.println("Digite o terceiro número:");
        float numero_3 = leitor.nextFloat();

        System.out.println();

        boolean ehPA = (numero_2 - numero_1) == (numero_3 - numero_2);
        boolean ehPG = (numero_1 * numero_3) == (numero_2 * numero_2);

        if (ehPA && ehPG) {
            float razaoPa = numero_2 - numero_1;
            System.out.println(
                    "É uma PA e também uma PG com os termos: (" + numero_1 + ", " + numero_2 + ", " + numero_3 + ")");
            System.out.println("Como PA, a razão r = " + razaoPa);

            if (numero_1 == 0 && numero_2 == 0) {
                System.out.println("Como PG, a razão q é indeterminada (qualquer número serviria).");
            } else {
                float razaoPg = numero_2 / numero_1;
                System.out.println("Como PG, a razão q = " + razaoPg);
            }

        } else if (ehPA) {
            float razaoPa = numero_2 - numero_1;
            System.out.println("É uma PA com os termos: (" + numero_1 + ", " + numero_2 + ", " + numero_3
                    + ") com razão r = " + razaoPa);

        } else if (ehPG) {
            if (numero_1 != 0) {
                float razaoPg = numero_2 / numero_1;
                System.out.println("É uma PG com os termos: (" + numero_1 + ", " + numero_2 + ", " + numero_3
                        + ") com razão q = " + razaoPg);
            } else {
                System.out.println("Não é uma PA e nem uma PG");
            }

        } else {
            System.out.println("Não é uma PA e nem uma PG");
        }

        leitor.close();
    }
}