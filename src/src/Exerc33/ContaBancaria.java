package Exerc33;

public class ContaBancaria {

    int numeroDaConta;
    String titular;
    double saldo;

    public void depositar(double deposito){
        saldo = saldo + deposito;
    }

    public void sacar(double saque){
        if(this.saldo > saque) {
            saldo = saldo - saque;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
