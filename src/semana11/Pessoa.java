package semana11;

public class Pessoa{

        double altura;
        double peso;
        double IMC;

        public double calcularIMC() {
            IMC = peso / (altura * altura);
            return IMC;
        }
   
        public String faixa() {
            if (IMC < 18.5) {
                return "abaixo do peso";
            } 
            else { 
                if (IMC < 24.9) {
                 return "no peso ideal";
                } 
                    else {
                        return "acima do peso";
                    }
            }
        }

        public String situacao() {
            if (IMC < 18.5) {
                return "GANHAR";
            } 
            else { 
                if (IMC < 24.9) {
                 return "NORMAL";
                } 
                    else {
                        return "PERDER";
                    }
                
            }
        }
    }
