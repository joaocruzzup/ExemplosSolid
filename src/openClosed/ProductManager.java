package openClosed;

public class ProductManager extends Funcionario implements HorasExtras{

    public ProductManager(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void imprimirFuncao() {
        System.out.println("Product Manager");
    }

    @Override
    public void aumentoPorHorasExtras(int horasExtras) {
        double aumento = getSalario() * horasExtras * 0.1;
        System.out.println("Aumento de: R$ " + aumento);
        setSalario(getSalario());
    }
}
