package singleResponsibility;

public class FuncionarioValidacao {

    public boolean validarFuncionario(Funcionario funcionario){
        boolean valido = validarNome(funcionario.getNome()) && validarSalario(funcionario.getSalario());
        String mensagem = valido ? "Funcionário Válido" : "Funcionário Inválido";
        System.out.println(mensagem);
        return valido;
    }

    public boolean validarNome(String nome){
        if (nome == null && nome.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean validarSalario(double salario){
        if (salario < 0 ){
            System.out.println("Funcionário inválido");
            return false;
        }
        return true;
    }

}
