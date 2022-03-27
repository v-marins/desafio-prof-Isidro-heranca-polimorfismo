package br.com.piBank;

public class Conta {

    private String nome;
    private String cpf;
    private int numConta;
    private float saldo;

    public Conta(String nome, String cpf, int numConta, float saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "**** Resumo Conta ****"+"\n"+
                "Nome: "+nome+"\n"+
                "CPF: "+cpf+"\n" +
                "Nº CC: "+numConta+"\n"+
                "Saldo: "+saldo+"\n"+
                "*********************";
    }

    public boolean Debitar(float valor) {

        if (valor <= saldo) {
            saldo = saldo - valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }

    public void Creditar(float valor){
            saldo = saldo + valor;
        }





}
