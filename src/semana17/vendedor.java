package semana17;

public class vendedor {
    
    protected String nome;
    protected double vendas;
    protected double comissao;

    public vendedor(String nome, double vendas, double comissao) {
        this.nome = nome;
        this.vendas = vendas;
        this.comissao = comissao;
    }

    public double obterSalario() {
        return vendas * (comissao/100);
    }

}
