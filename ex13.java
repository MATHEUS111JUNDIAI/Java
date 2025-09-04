//Matheus De Oliveira

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em °C para conversão em  Fahrenheit: ");
        float tempCelsius = leitor.nextFloat();

        System.out.println();

        float tempFahrenheit = (tempCelsius * 9) / 5 + 32;
        System.out.println(
                "A sua temperatura " + tempCelsius + "°C convertida para Fahrenheit ficará: " + tempFahrenheit + "°F");

        leitor.close();

    }
}
