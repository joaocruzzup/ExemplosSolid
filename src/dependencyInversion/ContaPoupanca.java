package dependencyInversion;

public class ContaPoupanca extends Conta implements Operacoes{
    public ContaPoupanca(double saldo, String numConta) {
        super(saldo, numConta);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando R$" + valor + " da conta poupança");
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor + " da conta poupança");
    }

    @Override
    public void verSaldo() {
        System.out.println("Saldo: R$" + getSaldo());
    }
}
