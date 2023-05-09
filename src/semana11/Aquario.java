package semana11;

public class Aquario {
    public double altura;
    public double largura;
    public double comprimento;
    public double temp_desejada;
    public double temp_ambiente;

    public double CalcularVolume() {
        return (altura * largura * comprimento)/1000;
    }

    public double PotenciadoTermostato() {
        return CalcularVolume() * 0.05 * (temp_desejada-temp_ambiente);
    }
    public double filtragemMIN = 2*CalcularVolume();
    public double filtragemMAX = 3*CalcularVolume();
}
