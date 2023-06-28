package singleResponsibility;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Joao", 5000);
        FuncionarioValidacao funcionarioValidacao = new FuncionarioValidacao();

        funcionarioValidacao.validarFuncionario(funcionario);
    }
}
