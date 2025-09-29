import ed.armaz_seq.Fila;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Fila fila = new Fila(30);

        for (int i = 0; i < 13; i++) {
            System.out.print((i + 1) + "° Digito do 1°RA: ");
            int valor = scanner.nextInt();
            fila.adicionar(valor);
        }
        for (int i = 0; i < 13; i++) {
            System.out.print((i + 1) + "° Digito do 2°RA: ");
            int valor = scanner.nextInt();
            fila.adicionar(valor);
        }

        System.out.println("\nRAs armazenados na fila:");
        System.out.println();
        System.out.println(fila.toString());
        System.out.println();

        Fila filaFinal = new Fila(30);
        while (!fila.vazia()) {
            int elemento = (int) fila.remover();
            if (elemento % 2 != 0) {
                filaFinal.adicionar(elemento);
            }
        }
        System.out.println("Fila após remover os pares: ");
        System.out.println(filaFinal.toString());

        scanner.close();
    }
}
