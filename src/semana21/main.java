package semana21;

import java.util.ArrayList;

// interface = contrato
// conjunto de metodos somente com a assinatura, sem corpo
//classe concreta que IMPLEMENTA a interface

// class abstrata figuraGeometrica - 
// interface figuraGeometrica

//Quadrado - lado - calcular area e perimetro
//retangulo - base, altura - calcular area e perimetro
//circulo - ...

public class main{

    public static void main(String[] args) {
        System.out.println("Main...");

        Quadrado q1 = new Quadrado(10);
        Quadrado q2 = new Quadrado(20);

        Retangulo r1 = new Retangulo(5, 10);

        Circulo c1 = new Circulo(2);

        Tela tela = new Tela();
        tela.addFigura(q1);
        tela.addFigura(q2);
        tela.addFigura(r1);
        tela.addFigura(c1);

        System.out.println(tela.TotalArea());
        System.out.println(tela.TotalPerimetro());


        //arrays
        double[] notas = new double[3];
        notas[0]= 10;
        notas[1]= 8;
        notas[2]= 9;
        //notas[3]= 10;

        System.out.println(notas[0]);

        //colecoes
        //list
        //set
        //map chave - valor

        //String[] nomes = new String[10];
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("pedro");

        nomes.get(1);
        System.out.println(nomes.get(1));

        System.out.println(nomes.size());

        //nomes.clear();

        System.out.println(nomes.size());

        // for (int i = 0; i < nomes.size(); i++) {
        //     String nome = nomes.get(i);
        // }

        for (String n : nomes) {
            System.out.println(n);
        }

        nomes.remove(1);
        //nomes.remove("maria");
    }
}
