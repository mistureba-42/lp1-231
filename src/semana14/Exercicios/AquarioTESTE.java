package semana14.Exercicios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTESTE {
    @Test
    public void testeVolume() {
        Aquario aqua = new Aquario(5.0);

        double volume = aqua.CalcularVolume();

        assertEquals(0.125,volume);
    }
}
