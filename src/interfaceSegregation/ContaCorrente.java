package interfaceSegregation;

public class ContaCorrente extends Conta implements Sacavel, Depositavel, Transferivel{
    public ContaCorrente(String numConta, double saldo) {
        super(numConta, saldo);
    }


    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso!");
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!");
    }

    @Override
    public void transferir(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Transferência realizada com sucesso!");
    }
}
