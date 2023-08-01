package semana17;

public class principal {
    
    public static void main(String[] args) {
        vendedor v1 = new vendedor("pedro", 50000.00, 10.00);
        vendedor v2 = new vendedor("joao", 100000.00, 12.00);
        vendedorFixo v3 = new vendedorFixo("marcia", 200000, 5.0, 2000.00);
        System.out.println(v1.obterSalario());
        System.out.println(v2.obterSalario());
        System.out.println(v3.obterSalario());
    }
}
