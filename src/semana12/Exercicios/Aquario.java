package semana12.Exercicios;

public class Aquario {
    public double altura;
    public double largura;
    public double comprimento;

    public Aquario(double altura, double largura, double comprimento){
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public Aquario (double valor){
        this.altura = valor;
        this.largura = valor;
        this.comprimento = valor;
    }
    public double CalcularVolume() {
        return (altura * largura * comprimento)/1000;
    }
}

