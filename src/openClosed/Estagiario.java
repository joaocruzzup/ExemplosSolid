package openClosed;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimirFuncao() {
        System.out.println("Estagiário");
    }
}
