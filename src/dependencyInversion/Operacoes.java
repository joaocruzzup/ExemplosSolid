package dependencyInversion;

public interface Operacoes {
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void verSaldo();
}
