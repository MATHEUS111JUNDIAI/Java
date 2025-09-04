//Matheus De Oliveira

import java.util.Scanner;

public class ex17 {
    private int[] numero;
    private int base = 2;

    public ex17(int[] numero) {
        this.numero = numero;
    }

    public double Conversao() {
        double decimal = 0;

        for (int i = 0; i < this.numero.length; i++) {
            int expoenteAtual = this.numero.length - i - 1;
            int digitoAtual = this.numero[i];
            double resultado = Math.pow(base, expoenteAtual);
            double count = digitoAtual * resultado;
            decimal = decimal + count;
        }

        return decimal;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número em binario: ");
        String entradaBinaria = leitor.next();

        int[] digitosBinarios = new int[entradaBinaria.length()];

        for (int i = 0; i < entradaBinaria.length(); i++) {
            digitosBinarios[i] = Character.getNumericValue(entradaBinaria.charAt(i));
        }

        ex17 meuConversor = new ex17(digitosBinarios);

        double result = meuConversor.Conversao();

        System.out.println("O numero binario " + entradaBinaria + " em decimal é: " + result);

        leitor.close();
    }
}