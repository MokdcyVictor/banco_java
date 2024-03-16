package com.vmp.banco.modelo;

import static java.util.Objects.*;

public class Conta {

    private String titular;
    private float saldo;
    private int agencia;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Conta (Pessoa titular, int numero, int agencia){
        requireNonNull(titular);
    this.titular = titular.toString();
    this.numero = numero;
    this.agencia = agencia;

    }

    public void depositar(float valor){
        if (valor<=0){
            throw new IllegalStateException("O valor depositado deve ser maior que 0");
        }
        saldo += valor;

    }
    public void sacar(float valor){
        if (valor<=0){
            throw new IllegalStateException("O valor sacado deve ser maior que 0");
        }
        else if (saldo - valor < 0){
            throw new IllegalStateException("Saldo Insuficiente");

        }
        saldo -= valor;

    }

}
