package questionTwo;

import java.util.Scanner;

public abstract class Conta {
    Scanner scan = new Scanner(System.in);
    //Obrigatório
    private int numero;
    private String titular;
    private double saldo;

    //Implementações
    private String banco;
    private String modalidade;

    //Getters & Setters


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public abstract void rendimento();

    public void sacar(){
        System.out.println("Qual valor você quer sacar: ");
        double valor = Double.parseDouble(scan.nextLine());
        if(valor<=getSaldo()){
            setSaldo(getSaldo()-valor);
            System.out.println("Valor sacado com sucesso!");
        }else{
            System.out.println("Você não possui esse valor, por segurança reinicie o processo");
            System.exit(0);
        }
    }

    public abstract void extrato();

    public abstract void calcularImposto();

    public abstract void deposito(float deposito);
}
