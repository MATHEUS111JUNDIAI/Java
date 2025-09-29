import ed.armaz_seq.Lista;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lista lista = new Lista(20);

        System.out.println("Digite valores inteiros positivos, até 20 digítos: ");

        int contador = 0;
        while (contador < 20) {
            System.out.print(
                    "Valor " + (contador + 1) + " (ou digite zero ou numero negativo para finalizar o programa): ");
            int valor = scanner.nextInt();

            if (valor <= 0) {
                break;
            }

            boolean existe = false;
            for (int i = 0; i < lista.comprimento(); i++) {
                int elem = (Integer) lista.elemento(i);
                if (elem == valor) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                lista.adicionar(valor);
            } else {
                lista.adicionar(-valor);
            }

            System.out.println(lista + " --> " + valor);
            contador++;
        }
        System.out.println();
        System.out.println("Lista Final");
        System.out.println(lista.toString());
        System.out.println();

        System.out.println("Índice de valores:");
        for (int i = 0; i < lista.comprimento(); i++) {
            int valor = Math.abs((Integer) lista.elemento(i));

            boolean jaContado = false;
            for (int j = 0; j < i; j++) {
                if (Math.abs((Integer) lista.elemento(j)) == valor) {
                    jaContado = true;
                    break;
                }
            }

            if (!jaContado) {
                int cont = 0;
                for (int k = 0; k < lista.comprimento(); k++) {
                    if (Math.abs((Integer) lista.elemento(k)) == valor) {
                        cont++;
                    }
                }
                if (cont == 1) {
                    System.out.println(cont + " número " + valor);
                } else {
                    System.out.println(cont + " números " + valor);
                }
            }
        }

        scanner.close();
    }

}
