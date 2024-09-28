package Exerc32;

public class Carro {

    String marca;
    String modelo;
    int ano;
    int velocidade;

    public void acelerar(int acelerar){
        velocidade = velocidade + acelerar;
    }

    public void freiar(int freiar){
        velocidade = velocidade - freiar;
    }

    public void darRe(int re){
        velocidade = 0;
        velocidade = velocidade - re;
    }

}
