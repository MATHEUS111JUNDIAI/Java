public class ProdutoLoja {
    public static void main(String[] args) {
        
        Produto caneta = new Produto("Caneta BIC", 2.50);

        System.out.println("--- Preço Original ---");
        caneta.exibirEtiqueta();

        System.out.println("\n.. aplicando desconto de 10%...");
        caneta.aplicarDesconto(10);

        System.out.println("\n--- Preço com Desconto");
        caneta.exibirEtiqueta();
    }
}
