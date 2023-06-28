package singleResponsibility;

public class FuncionarioValidacao {

    public boolean validarFuncionario(Funcionario funcionario){
        return validarNome(funcionario.getNome()) && validarSalario(funcionario.getSalario());
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
