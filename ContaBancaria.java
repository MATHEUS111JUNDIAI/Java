public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {

        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Valor de deposito invalido");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso");
        } else {
            System.out.println("Saque nao permitido (valor invalido ou saldo insuficiente)");
        }
    }

    public void verSaldo() {
        System.out.println("Saldo atual de " + this.titular + ": R$" + this.saldo);
    }
}
