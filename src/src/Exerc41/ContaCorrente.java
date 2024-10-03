package Exerc41;

public class ContaCorrente extends ContaBancaria{

    private String titular;
    private double saldo = 3000.00;

    @Override
    public void sacar(double saque) {
        if (saque > saldo) {
            System.out.println("A tentativa de saque tem valor maior que o saldo atual. Tente novamente.");
        } else {
            if (saque > 1000) {
                System.out.println("O saque ultapassa o limite de saque diário. Você saca apenas R$1000");
            } else {
                System.out.println("Você saca R$" + saque);
            }
        }
    }
}
