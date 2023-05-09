package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PessoaTESTE {
    @Test
    public void testeACIMA() {
        Pessoa gab = new Pessoa();

        gab.altura = 1.60;
        gab.peso = 85;

        double IMC = gab.calcularIMC();

        assertEquals(9.375, IMC);

    }

    @Test
    public void testeNORMAL() {
        Pessoa gab = new Pessoa();

        gab.altura = 1.60;
        gab.peso = 65;

        double IMC = gab.calcularIMC();

        assertEquals(9.375, IMC);

    }
    
    @Test
    public void testeABAIXO() {
        Pessoa gab = new Pessoa();

        gab.altura = 1.60;
        gab.peso = 24;

        double IMC = gab.calcularIMC();

        assertEquals(9.375, IMC);
    }
}