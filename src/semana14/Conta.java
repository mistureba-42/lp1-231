package semana14;

public class Conta {
    int codigo;
    double saldo = 0.0;
    String correntista;
    double sacado;
    double depositado;
    double transferido;

    public Conta(int codigo, String correntista){
        this.codigo = codigo;
        this.correntista = correntista;
    }

    public void sacar(){
        saldo =saldo - sacado;
    }

    public void depositar(){
        saldo = saldo + depositado;
    }

    public void transferir(){
        saldo = saldo - transferido;
    }
}

