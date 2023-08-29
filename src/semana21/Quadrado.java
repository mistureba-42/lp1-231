package semana21;

public class Quadrado implements FiguraGeometrica{
    
    private double lado;

    public Quadrado (double lado){
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(lado, 2);
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }
}
