package semana11;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AquarioTESTE {
    @Test
    public void testeVolume() {
        Aquario aqua = new Aquario();
        aqua.comprimento = 5.00;
        aqua.largura = 5.00;
        aqua.altura = 5.00;

        double volume = aqua.CalcularVolume();

        assertEquals(0.125,volume);
    }
}
