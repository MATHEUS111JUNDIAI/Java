public class PilhaGenerica {
    // array interno para armazenar os elementos contidos na pilha
    private Object[] conteudo;
    // controle interno de armazenamento da pilha
    private int topo;

    // Cria uma pilha com tamanho padrão 4 elementos.
    public PilhaGenerica() {
        topo = 0;
        conteudo = new Object[4];
    }

    // Cria uma pilha com tamanho padrão definido pelo usuário elementos.
    public PilhaGenerica(int tamanho) {
        topo = 0;
        conteudo = new Object[tamanho];
    }

    // Retorna a quantidade máxima de elementos que cabem na pilha.
    public int capacidade() {
        return conteudo.length;
    }

    // Retorna o número de elementos presentes na pilha.
    public int comprimento() {
        return topo;
    }

    // Verifica se pilha está cheia.
    public boolean cheia() {
        return topo == conteudo.length;
    }

    // Verifica se pilha está vazia.
    public boolean vazia() {
        return topo == 0;
    }

    // Adiciona um elemento no topo da pilha.
    public void adicionar(Object valor) {
        // verificar se pilha está cheia
        if (topo == conteudo.length) {
            throw new RuntimeException("pilha cheia");
        }
        conteudo[topo] = valor;
        topo++;
    }

    // Consulta o elemento existente na posição indicada pelo usuário.
    public Object elemento(int posicao) {
        // testar se posição é inválida
        if (posicao < 0 || posicao >= topo) {
            throw new RuntimeException("posição inválida: " + posicao);
        }
        return conteudo[posicao];
    }

    // Retira o elemento presente no topo da pilha.
    public Object remover() {
        // verificar se pilha está vazia
        if (topo == 0) {
            throw new RuntimeException("pilha vazia");
        }
        topo--;
        return conteudo[topo];
    }

    // Representação de texto do objeto: uma listagem dos elementos da pilha.
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < topo; i++) {
            sb.append(conteudo[i]);
            // Adiciona a vírgula se não for o último elemento
            if (i < topo - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}