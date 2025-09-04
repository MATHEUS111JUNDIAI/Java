public class aplicapessoa {
    public static void main(String[] args) {
        
        pessoa pessoa1 = new pessoa("ana", 30);

        pessoa pessoa2 = new pessoa("carlos",25);

        System.out.println("Apresentções");
        pessoa1.seApresentar();
        pessoa2.seApresentar();

        System.out.println("\n Acessando dados com os getters");
        String nomeDaPessoa2 = pessoa2.getNome();
        System.out.println("O nome do segundo participante é: " +nomeDaPessoa2);
    }
}
