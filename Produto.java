public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;

    }

    public void aplicarDesconto(double percentual){
        double valorDesconto = this.preco * (percentual/100.0);
        this.preco = this.preco - valorDesconto;
    }

    public void exibirEtiqueta(){
        System.out.println("Produto: "+this.nome);
        System.out.printf("Preço: R$ %.2f\n", +this.preco);
    }


}