package Exerc41;

public class ContaPoupanca extends ContaBancaria {

    private String titular;
    private double saldo = 3000.00;

    @Override
    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("A tentativa de saque tem valor maior que o saldo atual. Tente novamente.");
        } else {
            System.out.println("Você saca R$" + saque);
        }
    }
}
