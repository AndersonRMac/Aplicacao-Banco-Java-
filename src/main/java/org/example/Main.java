package org.example;

import org.example.contaModel.Conta;

public class Main {
    public static void main(String[] args) {
        Conta contaAnderson =  new Conta("Anderson", 1000.00);
        Conta contaAmanda = new Conta("Amanda", 1500.00);

        contaAnderson.MostraSaldo();
        contaAnderson.saque(350.00);
        System.out.println("------------------------------------------------");
        contaAnderson.transfere(contaAmanda, 1000);
        contaAmanda.MostraSaldo();
        contaAnderson.MostraSaldo();






    }
}