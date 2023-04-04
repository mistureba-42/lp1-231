package semana07;

public class ExerciciosRevisao01 {
    public static Double somar (double valor1, double valor2, double valor3){

        return valor1 + valor2 + valor3;
    }

    public static Double media (double valor1, double valor2, double valor3){

        return (valor1 + valor2 + valor3)/3 ;
    }

    public static int maior (int valor1, int valor2, int valor3){

        int maior = valor1;
        if (valor2>maior) {
            maior = valor2;
        }

        if (valor3>maior) {
            maior = valor3;
        }
        return maior;
    }
    public static int menor (int valor1, int valor2, int valor3){

        int menor = valor1;
        if (valor2<menor) {
            menor = valor2;
        }

        if (valor3<menor) {
            menor = valor3;
        }
        return menor;
    }
    public static Double[] Criararray(double valor1, double valor2, double valor3) {
        
        Double[] array = {valor1,valor2,valor3};
        return array;
    }
} 