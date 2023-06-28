package openClosed;

public class Recruiter extends Funcionario implements HorasExtras{

    public Recruiter(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimirFuncao() {
        System.out.println("Recruiter");
    }

    @Override
    public void aumentoPorHorasExtras(int horasExtras) {
        double aumento = getSalario() * horasExtras * 0.1;
        System.out.println("Aumento de: R$ " + aumento);
        setSalario(getSalario() + aumento);
    }
}
