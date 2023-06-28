package dependencyInversion;

public abstract class Conta {
    private double saldo;
    private String numConta;

    public Conta(double saldo, String numConta) {
        this.saldo = saldo;
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }
}
