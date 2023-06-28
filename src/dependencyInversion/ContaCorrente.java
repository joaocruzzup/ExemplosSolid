package dependencyInversion;

public class ContaCorrente extends Conta implements Operacoes{

    public ContaCorrente(double saldo, String numConta) {
        super(saldo, numConta);
    }

    @Override
    public void sacar(double valor) {
        System.out.println("Sacando R$" + valor + " da conta Corrente");
        setSaldo(getSaldo() - valor);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("Depositando R$" + valor + " da conta Corrente");
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void verSaldo() {
        System.out.println("Saldo: R$" + getSaldo());
    }
}
