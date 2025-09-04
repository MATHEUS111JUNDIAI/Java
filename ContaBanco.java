public class ContaBanco {
    public static void main(String[] args) { 

        ContaBancaria contaDaMaria = new ContaBancaria("Maria Souza", 500.00);

        contaDaMaria.verSaldo();

        contaDaMaria.depositar(200.00);
        contaDaMaria.sacar(150.00);
        contaDaMaria.sacar(800.00);

        contaDaMaria.verSaldo();

    }
}
