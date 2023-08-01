package semana17;

import java.time.LocalDate;

public class conta{

    private int numero;
    private LocalDate dataAbertura;
    protected double saldo;
    protected double tarifa;

    public void sacar(double valor){
        saldo = saldo - valor;
    }

    public void depositar(double valor){
        saldo = saldo + valor;
    }

    public double calcularTarifa(){
        return saldo = saldo - tarifa;
    }
}