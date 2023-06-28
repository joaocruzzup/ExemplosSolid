package interfaceSegregation;

public class Conta {
    private String numConta;
    private double saldo;

    public Conta(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void mostrarSaldo(){
        System.out.println("Saldo: R$ " + getSaldo());
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
