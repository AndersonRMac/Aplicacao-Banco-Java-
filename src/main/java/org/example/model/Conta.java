package org.example.model;

public class Conta {
    private String nome;
    private Double saldo;



    //atualizar para printf depois
    public void MostraSaldo(){
        System.out.println("Saldo atual de "+ getNome() + " = " + " R$ " + getSaldo());
    }
    public void deposito(double deposito) {
        if (deposito > 0){
            saldo = saldo + deposito;
            setSaldo(saldo);
            System.out.println("Seu novo saldo é " + getSaldo());
        }else System.out.println("Valor de deposito inválido!");
    }

    public void saque(Double valor){

        double limiteDiario = 400.00;

        if (valor >= saldo | valor <= limiteDiario){
            saldo = saldo - valor;
            setSaldo(saldo);

            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é: " + getSaldo());

        } else if (valor > limiteDiario) {
            System.out.println("Valor acima do limite diário permitido.");
        } else{
            System.out.println("Valor solicitado, indisponível. Solicite outro valor!");
        }

    }

    public int  transfere(String destino, double valor){

        if (valor < saldo){

            saldo = saldo - valor;
            System.out.println("Transferência para " + destino + " no valor de " + " R$ " + valor + " executada!");
            return  1;

        }else{
            System.out.println("Valor maior que o saldo atual!!");
            return 2;
        }
    }

    public Conta(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


}
