public class TesteFracao {

    public static void main(String[] args) {
        try {
            Fracao f1 = new Fracao(1, 2);
            Fracao f2 = new Fracao(3, 4);

            System.out.println("Fração 1: " + f1);
            System.out.println("Fração 2: " + f2);

            // Adição
            Fracao soma = f1.adicionar(f2);
            System.out.println("Soma: " + f1 + " + " + f2 + " = " + soma); // Esperado: 5/4

            // Subtração
            Fracao subtracao = f1.subtrair(f2);
            System.out.println("Subtração: " + f1 + " - " + f2 + " = " + subtracao); // Esperado: -1/4

            // Multiplicação
            Fracao multiplicacao = f1.multiplicar(f2);
            System.out.println("Multiplicação: " + f1 + " * " + f2 + " = " + multiplicacao); // Esperado: 3/8

            // Divisão
            Fracao divisao = f1.dividir(f2);
            System.out.println("Divisão: " + f1 + " / " + f2 + " = " + divisao); // Esperado: 2/3

            // Exemplo de simplificação no construtor
            Fracao f3 = new Fracao(10, 20);
            System.out.println("Fração 10/20 simplificada: " + f3); // Esperado: 1/2

            // Testando exceção para denominador zero
            // Fracao f4 = new Fracao(5, 0); // Descomente para testar a exceção

        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}