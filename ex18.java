//Matheus De Oliveira

import java.util.Scanner;

public class ex18 {

    private String numeroHex;
    private int base = 16;

    public ex18(String numeroHex) {
        this.numeroHex = numeroHex.toUpperCase();
    }

    public long paraDecimal() {
        long decimal = 0;

        for (int i = 0; i < this.numeroHex.length(); i++) {
            int expoente = this.numeroHex.length() - i - 1;
            char digitoChar = this.numeroHex.charAt(i);
            int valorDoDigito = valorDigitoHex(digitoChar);
            double valorDaPosicao = valorDoDigito * Math.pow(this.base, expoente);
            decimal += valorDaPosicao;
        }
        return decimal;
    }

    private int valorDigitoHex(char digito) {
        if (digito == 'A') {
            return 10;
        } else if (digito == 'B') {
            return 11;
        } else if (digito == 'C') {
            return 12;
        } else if (digito == 'D') {
            return 13;
        } else if (digito == 'E') {
            return 14;
        } else if (digito == 'F') {
            return 15;
        } else {
            return Character.getNumericValue(digito);
        }
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número em hexadecimal:");
        String entradaHex = leitor.next();

        ex18 conversor = new ex18(entradaHex);

        long resultadoDecimal = conversor.paraDecimal();

        System.out.println("O número hexadecimal '" + entradaHex.toUpperCase() + "' em decimal é: " + resultadoDecimal);

        leitor.close();
    }
}