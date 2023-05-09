package semana11;

public class Exercicio2 {
    public static void main(String[] args) {
        Pessoa gab = new Pessoa();

        gab.altura = 1.65;
        gab.peso = 85;

        System.out.println(gab.calcularIMC());
        System.out.println(gab.faixa());
        System.out.println(gab.situacao());
    }
}
