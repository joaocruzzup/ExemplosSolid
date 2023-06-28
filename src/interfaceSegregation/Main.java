package interfaceSegregation;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123", 3000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("456", 5000);
        ContaSalario contaSalario = new ContaSalario("789", 7000);

        contaCorrente.depositar(500);
        contaCorrente.sacar(300);
        contaCorrente.transferir(200);
        contaCorrente.mostrarSaldo();

        contaPoupanca.depositar(300);
        contaPoupanca.sacar(500);
        contaPoupanca.render(3);
        contaPoupanca.mostrarSaldo();

        contaSalario.transferir(200);
    }
}
