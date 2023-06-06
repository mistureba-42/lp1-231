package semana14.Exercicios;

public class Aquario {
    private double altura;
    private double largura;
    private double comprimento;

    public Aquario(double altura, double largura, double comprimento){
        this.setAltura(altura);
        this.setLargura(largura);
        this.setComprimento(comprimento);
    }

    public Aquario (double valor){
        this.altura = valor;
        this.largura = valor;
        this.comprimento = valor;
    }
    public double CalcularVolume() {
        return (altura * largura * comprimento)/1000;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setAltura(double altura){
        if(altura<=0.0){
            throw new RuntimeException("altura invalido");
        }
        this.altura = altura;
    }

    public void setLargura(double largura){
        if(largura<=0.0){
            throw new RuntimeException("largura invalido");
        }
        this.largura = largura;
    }

    public void setComprimento(double comprimento){
        if(comprimento<=0.0){
            throw new RuntimeException("comprimento invalido");
        }
        this.comprimento = comprimento;
    }
}

