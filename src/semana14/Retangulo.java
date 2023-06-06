package semana14;

public class Retangulo {
    //atributos
    private double base;
    private double altura;

    //construtor
    public Retangulo(double base, double altura){
        this.setBase(base);
        this.setAltura(altura);
    }

    //metodos
    public double calcularArea(){
        return base*altura;
    }

    public double calcularPerimetro(){
        return 2*(base+altura);
    }

    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setBase(double base){
        if(base<=0.0){
            throw new RuntimeException("base invalido");
        }
        this.base = base;
    }

    public void setAltura(double altura){
        if(altura<=0.0){
            throw new RuntimeException("altura invalido");
        }
        this.altura = altura;
    }

}
