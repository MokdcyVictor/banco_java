package com.vmp.banco.app;

import com.vmp.banco.modelo.Conta;
import com.vmp.banco.modelo.Pessoa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pessoa titular1 = new Pessoa();
            titular1.setNome("Nome");
            titular1.setDocumento("1232131231");

        Pessoa titular2 = new Pessoa();
        titular1.setNome("Maria");
        titular1.setDocumento("1232131231");

        Conta minhaConta = new Conta(titular1,1,100);

        Conta suaConta = new Conta(titular2,2,200);


        minhaConta.depositar(15000);
        suaConta.depositar(3000);

        System.out.println("saldo: " + suaConta.getSaldo());
        System.out.println("saldo: " + minhaConta.getSaldo());

        minhaConta.sacar(1000);
        System.out.println("depois: " + minhaConta.getSaldo());
    }
}