package semana04;

public class EstruturaControle {
    public static void main(String[] args) {
        //if 
        final int MAIORIDADE = 18;
        var idade = 19;

        if (idade >= MAIORIDADE) {
            System.out.println("maior de idade");
        }

        var ligado = true;

        if (ligado) {
            System.out.println("ligado");
        } else {
            System.out.println("desligado");
        }

        //switch
         //char, byte, short, int


        int n = 3;

        switch (n) {
            case 1: 
            System.out.println("numero 1");
                
                break;
            case 2: 
            System.out.println("numero 2");
            break;

            case 3: 
            System.out.println("numero 3");
            break;

            default:
            System.out.println("nao identificado");
                break;
        }
        //loops
        //for, foreach, while, do while

        int contador = 0;
        while (contador < 3) {
            System.out.println("ligado");
        }
        contador = 0;
        
        do {
            System.out.println("Do while ligado");
        contador++;
        } while (contador < 3);

        for (int i = 0; i < 3; i++) {
            System.out.println("for ligado");
        }
        //array
        //armazena mais de um elemento
        //acesso via index numero inteiro
        //tamanho fixo no momento da criacao

        //nomes -> [   ,   ,   ]
        //           0   1   2
        String[] nomes = new String [3];
        
        nomes[0] = maria;
        nomes[1] = marta;
        nomes[2] = marcia;
        
        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        //foreach
        for (String nome : nomes) {
            System.out.println(nome);
        }
        int[] numeros = [1,3,5,0];

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
