package semana04;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("entre com sua altura: ");
        double altura = input.nextDouble();

        System.out.print("entre com seu peso: ");
        double peso = input.nextDouble();


        double imc = peso / (altura * altura);

        System.out.println("seu IMS e: " + imc);

        if (imc < 18.5) {
            System.out.println("voce esta abaixo do peso");
            double PesoNormal = 18.5* (altura*altura);
            System.out.println("voce precisa ganhar" + (PesoNormal-peso) + "kilos");
        }
        else if (imc < 24.9) {
            System.out.println("voce esta no peso normal");

        }
        else if (imc < 29.9) {
             System.out.println("voce esta com excesso de peso peso");
             double PesoNormal = 29.9* (altura*altura);
             System.out.println("voce precisa perder" + (PesoNormal-peso) + "kilos");
        }
        else if (imc < 34.9) {
            System.out.println("voce esta com obesidade classe 1");
            double PesoNormal = 34.9* (altura*altura);
            System.out.println("voce precisa perder" + (PesoNormal-peso) + "kilos");
       }
       else if (imc < 39.9) {
        System.out.println("voce esta com obesidade classe 2");
        double PesoNormal = 39.9* (altura*altura);
        System.out.println("voce precisa perder" + (PesoNormal-peso) + "kilos");
       }
       else if (imc >= 40.0) {
        System.out.println("voce esta com obesidade classe 3");
        double PesoNormal = 40.0* (altura*altura);
        System.out.println("voce precisa perder" + (PesoNormal-peso) + "kilos");
       }
  
        input.close();
    }
}
