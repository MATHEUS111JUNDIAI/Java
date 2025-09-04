public class CarroGaragem {
    public static void main(String[]args){
        Carro meuFusca = new Carro("Vokswagen", "Fusca", 1975);
        Carro meuOnix = new Carro("Chevrolet", "Onix", 2023);

        meuFusca.exibirDados();
        System.out.println();
        meuOnix.exibirDados();
    }
}
