package Exerc41;

public abstract class ContaBancaria {

    private String titular;
    private double saldo = 3000.00;

    public abstract void sacar(double saque);
}
