package org.example.contaModel;

public class Conta {
    private String nome;
    private Double saldo;

    public void MostraSaldo(){
        System.out.println("Saldo atual de "+ getNome() + " = " + saldo);
    }

    public void saque(Double valor){

        double limiteDiario = 400.00;

        if (valor > saldo | valor < limiteDiario){

            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
            System.out.println("Seu novo saldo é: " + saldo);

        } else if (valor > limiteDiario) {
            System.out.println("Valor acima do limite diário permitido. Entre com outro valor.");
        } else{
            System.out.println("Valor solicitado, indisponível. Solicite outro valor!");
        }

    }

    public void transfere(Conta destino, double valor){

        if (valor < saldo){
            this.saldo = this.saldo - valor;
            destino.saldo = destino.saldo + valor;
        }else{
            System.out.println("Valor inválido, favor entrar com outro valor!!");
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
