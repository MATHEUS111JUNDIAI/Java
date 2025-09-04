//pilha exclusiva para valores inteiros.

public class Pilha {
    private int[] vet;
    private int topo = 0;

    public Pilha() { // construtor default tamanho padrao 10
        vet = new int[10];
    }

    public Pilha(int tamanho) { // construtor parametrizado com tamanho
        vet = new int[tamanho];
    }

    public void adicionar(int elemento) {
        if (cheia()) {
            throw new RuntimeException("Pilha cheia");
        }
        vet[topo] = elemento;
        topo++;

    }

    public int remover() {
        if (vazia()) {
            throw new RuntimeException("pilha vazia");
        }
        int aux = --topo; //
        //
        return vet[aux]; // return vet[--topo] melhor opção
    }

    public boolean vazia() {
        // pilha esta vazia quando
        return topo == 0;
    }

    public boolean cheia() {
        // pilha esta cheia quando
        return topo == vet.length;
    }

    public int capacidade() {
        return vet.length;

    }

    public int comprimento() {
        return topo;
    }

    public String toString() {
        String resultado = "[";
        for (int i = 0; i < topo; i++) {
            resultado = resultado + vet[i] + ",";
        }
        resultado += "]";
        return resultado;
    }
}