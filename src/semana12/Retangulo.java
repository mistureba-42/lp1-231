package semana12;

public class Retangulo {
    //atributos
    public double base;
    public double altura;

    //construtor
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    //metodos
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }
}
