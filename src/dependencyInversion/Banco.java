package dependencyInversion;

public class Banco {
    private Operacoes operacoes;

    public Banco(Operacoes operacoes) {
        this.operacoes = operacoes;
    }

    public void sacar(double valor){
        operacoes.sacar(valor);
    }

    public void depositar(double valor){
        operacoes.depositar(valor);
    }

    public void verSaldo(){
        operacoes.verSaldo();
    }
}
