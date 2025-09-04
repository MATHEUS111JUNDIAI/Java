public class pessoa {

    // DADOS OU ATRIBUTOS

    private String nome;
    private int idade;

    // CONSTRUTOR

    public pessoa(String nomeInicial, int idadeInicial) {

        this.nome = nomeInicial;
        this.idade = idadeInicial;
    }

    public void seApresentar() {
        System.out.println("Ola meu nome é " + this.nome + " e eu tenho " + this.idade + " anos.");

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}