package org.example.model;


import java.util.Scanner;

public class BancoOperacao {

    public void acionaAplicacao(){

        Scanner in = new Scanner(System.in);
        String nome;
        double saldo;
        int servico;
        String decicao;

        System.out.println("Informe seu nome: ");
        nome = in.nextLine();

        System.out.println("Informe seu saldo: ");
        saldo = in.nextDouble();

        System.out.println("-------------------------------------------------------");
        System.out.println("Seja bem vindo " + nome);
        System.out.println("-------------------------------------------------------");
        Conta user = new Conta(nome, saldo);


            while ((nome != null) | (saldo != 0)){
            System.out.println("Que serviços você deseja utilizar?");
            System.out.println("-------------------------------------------------------");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Fazer um saque");
            System.out.println("3 - Fazer um depósito");
            System.out.println("4 - Fazer uma transferência");
            servico = in.nextInt();

            System.out.println("-------------------------------------------------------");

            switch (servico){
                case 1 :
                    user.MostraSaldo();
                    System.out.println("-------------------------------------------------------");
                    System.out.println("Deseja usar outro serviço? S ou N: ");
                    decicao = in.next();
                    if (decicao.equals("S"))
                    break;
                    else System.exit(1);
                case 2 :
                    System.out.println("Digite o valor que você quer sacar: ");
                    double saque = in.nextDouble();
                    user.saque(saque);
                    System.out.println("Deseja usar outro serviço? S ou N: ");
                    decicao = in.next();
                    if (decicao.equals("S"))
                        break;
                    else System.exit(1);
                case 3:
                    System.out.println("Digite o valor que você quer depositar: ");
                    double deposito= in.nextDouble();
                    user.deposito(deposito);
                    System.out.println("Deseja usar outro serviço? S ou N: ");
                    decicao = in.next();
                    if (decicao.equals("S"))
                        break;
                    else System.exit(1);
                case 4:
                    System.out.println("Digite o nome do titular da conta que você vai transferir: ");
                    String userDest = in.next();
                    System.out.println("Digite o valor que você quer transferir: ");
                    double valorTransf = in.nextDouble();
                    user.transfere(userDest, valorTransf);
                    System.out.println("Deseja usar outro serviço? S ou N: ");
                    decicao = in.next();
                    if (decicao.equals("S"))
                        break;
                    else System.exit(1);
                default:
                    System.out.println("Opção Inválida!");
                    System.out.println("-------------------------------------------------------");

            }
        }
    }
}
