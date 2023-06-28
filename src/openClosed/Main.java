package openClosed;

public class Main {
    public static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Joao", 1500);
        Estagiario estagiario = new Estagiario("Victor", 600);
        ProductManager productManager = new ProductManager("Cruz", 3000);
        Recruiter recruiter = new Recruiter("Silva", 3000);

        desenvolvedor.imprimirFuncao();
        desenvolvedor.aumentoPorHorasExtras(30);

        estagiario.imprimirFuncao();

        productManager.imprimirFuncao();
        productManager.aumentoPorHorasExtras(50);

        recruiter.imprimirFuncao();
        recruiter.aumentoPorHorasExtras(10);

    }
}
