package semana10;

public class Programa {
    public static void main(String[] args) {
        
        double baseRet1 = 10.0;
        double alturaRet1 = 5.0;
        double areaRet1 = calcularArea(baseRet1, alturaRet1);
        double perimetroRet1 = calcularPerimetro(baseRet1, alturaRet1);
        
        System.out.println(areaRet1);
        System.out.println(perimetroRet1);

        String palavra = "abc";

        Retangulo ret1 = new Retangulo();
        ret1.base = 10.0;
        ret1.altura = 5.0;

        Retangulo ret2 = new Retangulo();
        ret2.base = 30;
        ret2.altura = 100;

        Quadrado quad1 = new Quadrado();
        quad1.lado = 5.0;

        Circulo cir1 = new Circulo();
        cir1.raio = 1.0;

        System.out.println(ret1.calcularArea());

        System.out.println(ret1.calcularPerimetro());

        System.out.println(ret2.calcularArea());

        System.out.println(ret2.calcularPerimetro());

        System.out.println(quad1.calcularArea());

        System.out.println(quad1.calcularPerimetro());

        System.out.println(cir1.calcularArea());

        System.out.println(cir1.calcularPerimetro());

        System.out.println(palavra.toUpperCase());
        }

    public static double calcularArea(double base, double altura) {
    return base*altura;
    }

    public static double calcularPerimetro(double base, double altura) {
    return 2*(base+altura);
    }
}
