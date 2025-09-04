public class Fracao {

    private int numerador;
    private int denominador;

    /**
     * Construtor para a classe Fracao.
     * @param numerador O numerador da fração.
     * @param denominador O denominador da fração.
     * @throws IllegalArgumentException se o denominador for zero.
     */
    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        this.simplificar();
    }

    /**
     * Retorna o numerador da fração.
     * @return o numerador.
     */
    public int getNumerador() {
        return numerador;
    }

    /**
     * Retorna o denominador da fração.
     * @return o denominador.
     */
    public int getDenominador() {
        return denominador;
    }

    /**
     * Adiciona uma fração a esta fração.
     * @param outra A fração a ser adicionada.
     * @return uma nova Fração com o resultado da adição.
     */
    public Fracao adicionar(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador + outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    /**
     * Subtrai uma fração desta fração.
     * @param outra A fração a ser subtraída.
     * @return uma nova Fração com o resultado da subtração.
     */
    public Fracao subtrair(Fracao outra) {
        int novoNumerador = this.numerador * outra.denominador - outra.numerador * this.denominador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    /**
     * Multiplica esta fração por outra fração.
     * @param outra A fração a ser multiplicada.
     * @return uma nova Fração com o resultado da multiplicação.
     */
    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    /**
     * Divide esta fração por outra fração.
     * @param outra A fração pela qual dividir.
     * @return uma nova Fração com o resultado da divisão.
     * @throws IllegalArgumentException se a outra fração for zero.
     */
    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new IllegalArgumentException("Divisão por fração zero não é permitida.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    /**
     * Simplifica a fração, dividindo o numerador e o denominador pelo seu máximo divisor comum.
     */
    private void simplificar() {
        int mdc = calcularMDC(this.numerador, this.denominador);
        this.numerador /= mdc;
        this.denominador /= mdc;

        // Garante que o sinal negativo fique no numerador
        if (this.denominador < 0) {
            this.numerador *= -1;
            this.denominador *= -1;
        }
    }

    /**
     * Calcula o Máximo Divisor Comum (MDC) entre dois números usando o algoritmo de Euclides.
     * @param a O primeiro número.
     * @param b O segundo número.
     * @return O MDC de a e b.
     */
    private int calcularMDC(int a, int b) {
        return b == 0 ? a : calcularMDC(b, a % b);
    }

    /**
     * Retorna a representação da fração como uma String.
     * @return uma string no formato "numerador/denominador".
     */
    @Override
    public String toString() {
        return this.numerador + "/" + this.denominador;
    }
}