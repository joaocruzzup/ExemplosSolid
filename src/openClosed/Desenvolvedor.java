package openClosed;

public class Desenvolvedor extends Funcionario implements HorasExtras{

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimirFuncao() {
        System.out.println("Desenvolvedor");
    }


    @Override
    public void aumentoPorHorasExtras(int horasExtras) {
        double aumento = getSalario() * horasExtras * 0.1;
        System.out.println("Aumento de: R$ " + aumento);
        setSalario(getSalario() + aumento);
    }
}
