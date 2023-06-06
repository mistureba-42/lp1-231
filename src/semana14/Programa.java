package semana14;

public class Programa {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(10.0);
        //quadrado.lado = 10.0;

        System.out.println(quadrado.calcularArea());
        System.out.println(quadrado.calcularPerimetro());
        System.out.println(quadrado.getLado());
        quadrado.setLado(5.0);
        System.out.println(quadrado.getLado());

        Retangulo r1 = new Retangulo(10.0, 5.0);
        Retangulo r2 = new Retangulo(15.5, 3.5);

        System.out.println(r1.calcularArea());
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.getBase());
        System.out.println(r1.getAltura());
        r1.setBase(5.0);
        r1.setAltura(10.0);
        System.out.println(r1.getBase());
        System.out.println(r1.getAltura());

        System.out.println(r2.calcularArea());
        System.out.println(r2.calcularPerimetro());
        System.out.println(r2.getBase());
        System.out.println(r2.getAltura());
        r2.setBase(10.0);
        r2.setAltura(15.0);
        System.out.println(r2.getBase());
        System.out.println(r2.getAltura());


        Circulo c1 = new Circulo(2.0);

        System.out.println(c1.calcularArea());
        System.out.println(c1.calcularPerimetro());
        System.out.println(c1.getRaio());
        c1.setRaio(5.0);
        System.out.println(c1.getRaio());
    }

}
