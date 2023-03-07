package semana03;

import java.util.Scanner;

public class Introducao {
    public static void main (String[] args){
        //comentario de linha
        /*
         * comentario de multiplas linhas         * 
         */

          //tipos primitivos

          /*
           * inteiros
           * byte, short, int, long           * 
           */

           byte n1= 100; // 1 byte 128 a 127
           short n2= 3000; // 2 bytes 32768 a 32767
           int n3= 40000; // 4 bytes 2 bilhoes
           long n4= 323232323232l; //8 bytes
        // ponto flutuante
        // float, double
        float nota1 = 9.5f; //4 bytes
        double nota2 = 9.5; //8 bytes

        //char
        char letra = 'A';
        
        //boolean
        boolean ligado = true;
        boolean teste = false;
        
        //string
        String palavra = "ola mundo";

        System.out.println(palavra);
        System.out.println(palavra.toLowerCase());
        System.out.println(palavra.toUpperCase());

        //variaveis e constantes
        //tipo nome = valor
        /*tipo nome
         * nome = valor*/

        short idade = 30;
        short idade2;
        idade2 = 30;

        // java 10-  inferência de tipos

        var sobrenome = "Santos";
        var idade3 = 25;

        // constantes

        final double TESTE = 30.4;

        // entrada e saida de dados
        // instancia um objeto scanner partring nomeInformado = sc.nextLine();a receber dados do usuario

        Scanner sc = new Scanner(System.in);

        
        

        System.out.println("entre com o seu nome");
        String nomeInformado = sc.nextLine();

        System.out.println("entre com a sua idade");
        int idadeInformado = sc.nextShort();

        System.out.println(nomeInformado +" "+ idadeInformado);
        // fecha o objeto scanner liberando os recursos alocados
        sc.close();


    }
}
