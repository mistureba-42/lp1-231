package semana14.Exercicios;

public class Pessoa {
    private double altura;
    private double peso;
    private double IMC;

    public Pessoa (double altura, double peso){
        this.setPeso(peso);
        this.setAltura(altura);
    }

    public double calcularIMC() {
        IMC = peso / (altura * altura);
        return IMC;
    }

    public String faixa() {
        if (IMC < 18.5) {
            return "abaixo do peso";
        } 
        else { 
            if (IMC < 24.9) {
             return "no peso ideal";
            } 
                else {
                    return "acima do peso";
                }
        }
    }

    public String situacao() {
        if (IMC < 18.5) {
            return "GANHAR";
        } 
        else { 
            if (IMC < 24.9) {
             return "NORMAL";
            } 
                else {
                    return "PERDER";
                }
            
        }
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getIMC() {
        return IMC;
    }

    public void setAltura(double altura){
        if(altura<=0.0){
            throw new RuntimeException("altura invalido");
        }
        this.altura = altura;
    }

    public void setPeso(double peso){
        if(peso<=0.0){
            throw new RuntimeException("peso invalido");
        }
        this.peso = peso;
    }
}
