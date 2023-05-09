package semana11;

public class Exercicio1{

public static void main(String[] args) {
    
        Aquario aqua1 = new Aquario();
        aqua1.altura = 5.00;
        aqua1.largura = 5.00;
        aqua1.comprimento = 5.00;
        aqua1.temp_desejada = 25.00;
        aqua1.temp_ambiente = 30.00;

        System.out.println(aqua1.CalcularVolume());
        System.out.println(aqua1.PotenciadoTermostato());
    }
}