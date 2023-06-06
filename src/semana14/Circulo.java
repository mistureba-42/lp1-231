package semana14;

public class Circulo {
    
    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio){
        if(raio<=0.0){
            throw new RuntimeException("raio invalido");
        }
        this.raio = raio;
    }

}
 