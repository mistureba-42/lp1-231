package semana17;

public class vendedorFixo extends vendedor{
    
    private double salario;

    public vendedorFixo(String nome, double vendas, double comissao, double salario){
        super(nome, vendas, comissao);
        this.salario = salario;
    }

    @Override
    public double obterSalario(){
        return (vendas * (comissao/100))+ salario;
    }
}