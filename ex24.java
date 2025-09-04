//Matheus De Oliveira

import java.util.Scanner;

public class ex24 {
    private double Fahrenheit;

    public ex24(double Fahrenheit) {
        this.Fahrenheit = Fahrenheit;
    }

    public double Conversao() {
        double Celsius = 5 * (this.Fahrenheit - 32) / 9;

        return Celsius;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a sua temperatura em Farenheit(°F) para a conversão : ");
        Double Fahrenheit = leitor.nextDouble();

        ex24 conversor = new ex24(Fahrenheit);

        Double Celsius = conversor.Conversao();

        System.out.printf("\nA temperatura em Celsius é: %.2f°C", Celsius);

        leitor.close();

    }
}
