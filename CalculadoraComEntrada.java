import java.util.Scanner;

public class CalculadoraComEntrada {

    public static void main(String[] args){
         Scanner leitor = new Scanner(System.in);
         System.out.println("digite um numero");

         float numero1 = leitor.nextFloat();
         
         System.out.println("Digite outro numero");

         float numero2 = leitor.nextFloat();

        
         System.out.println("escolha uma operação matematica, 1 é soma, 2 é subtração, 3 é multiplicação e 4 é divisão:");
         
         float operacao = leitor.nextFloat();
         
         if (operacao==1)
         {
            float soma = numero1 + numero2;
            System.out.println("a soma dos numeros é igual a: " + soma);
         }

         else if (operacao==2)
         {
            float subtracao = numero1 - numero2;
            System.out.println("a subtração dos numeros é igual a: " + subtracao);
         }

         else if (operacao==3)
         {
            float multiplicacao = numero1 * numero2;
            System.out.println("a multiplicção dos numeros é igual a: " + multiplicacao);
         }

         else if (operacao==4&&numero2==0)
         {
            System.out.println("Erro!!!");
         }

         else if (operacao==4)
         {
            float divisao = numero1 / numero2;
            System.out.println("a subtração dos numeros é igual a: " + divisao);
         }
         
         else
         {
        
            System.out.println("digite uma operação valida");
         }

         System.out.println("os numeros digitados respectivamente são: " + numero1 +" e " +numero2);

         leitor.close();


    }
}