package singleResponsibility;

public class FuncionarioValidacao {

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
