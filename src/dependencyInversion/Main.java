package dependencyInversion;

public class Main {
    public static void main(String[] args) {
        Operacoes operacoesCC = new ContaCorrente(3000, "123");
        Operacoes operacoesCP = new ContaPoupanca(5000, "456");

        Banco bancoCC = new Banco(operacoesCC);
        bancoCC.sacar(100);
        bancoCC.depositar(200);
        bancoCC.verSaldo();

        Banco bancoCP = new Banco(operacoesCP);
        bancoCP.sacar(1000);
        bancoCP.depositar(500);
        bancoCP.verSaldo();

    }
}
