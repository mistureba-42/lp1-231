package semana10;

public class Retangulo {
        //atributos
        public double base;
        public double altura;
    
        //metodos
        public double calcularArea() {
            return base*altura;
        }
        public double calcularPerimetro() {
            return 2 * (base + altura);
        }
}
