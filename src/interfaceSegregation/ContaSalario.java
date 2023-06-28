package interfaceSegregation;

public class ContaSalario extends Conta implements Transferivel{
    public ContaSalario(String numConta, double saldo) {
        super(numConta, saldo);
    }

    @Override
    public void transferir(double valor) {
        setSaldo(getSaldo() - valor);
        System.out.println("Transferência realizada com sucesso!");
    }
}
