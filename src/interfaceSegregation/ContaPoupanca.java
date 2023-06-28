package interfaceSegregation;

public class ContaPoupanca extends Conta implements Rentavel, Depositavel, Sacavel{

    public ContaPoupanca(String numConta, double saldo) {
        super(numConta, saldo);
    }


    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Depósito realizado com sucesso!");

    }

    @Override
    public void render(int meses) {
        double taxaRendimento = 0.001;
        System.out.println("Seu dinheiro irá render: R$ " + taxaRendimento*meses*getSaldo() + " em " + meses + " meses");
    }

    @Override
    public void sacar(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!");
    }
}
