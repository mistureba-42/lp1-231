package semana04;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   

        System.out.print("entre com a altura: ");
        double altura = sc.nextDouble();

        System.out.print("entre com a  largura: ");
        double largura= sc.nextDouble();

        System.out.print("entre com o comprimento: ");
        double comprimento = sc.nextDouble();
        
        double volume = (comprimento*altura*largura)/1000.0;

        System.out.println("o volume e: " +volume);

        System.out.print("entre com a temperatura desejada no aquario: ");
        double temperatura_desejada = sc.nextDouble();

        System.out.print("entre com a temperatura ambiente: ");
        double temperatura_ambiente = sc.nextDouble();

        double potencia_termostato = volume * 0.05 * (temperatura_desejada - temperatura_ambiente);

        System.out.println("a potencia do termostato deve estar em:" + potencia_termostato);

        double filtragem_min = 2*volume;
        double filtragem_max = 3*volume;

        System.out.println("a filtragem deve estar entre: " + filtragem_min +" e : " + filtragem_max);

        sc.close();
    }
   
    
}
