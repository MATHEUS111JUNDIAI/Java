public class TestePilha {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        System.out.println(p + " Comprimento: " + p.comprimento());

        int v = 10;
        while (!p.cheia()) {
            p.adicionar(v);
            v += 10;
            System.out.println(p + " Comprimento: " + p.comprimento());

        }
        while (!p.vazia()) {
            v = p.remover();
            System.out.println(p + " --> " + v);
        }
    }
}
