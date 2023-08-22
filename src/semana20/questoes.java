package semana20;

import java.util.ArrayList;
import java.util.List;

    abstract class questao {
        private int numero;
        private String enunciado;

        public questao(int numero, String enunciado) {
            this.numero = numero;
            this.enunciado = enunciado;
        }

        public int getNumero() {
            return numero;
        }

        public String getEnunciado() {
            return enunciado;
        }
    }
