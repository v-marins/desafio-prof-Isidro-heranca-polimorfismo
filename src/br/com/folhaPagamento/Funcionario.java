package br.com.folhaPagamento;

public abstract class Funcionario {

    private String nome;
    private int numRegistro;

    public Funcionario(String nome, int numRegistro) {
        this.nome = nome;
        this.numRegistro = numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public abstract float CalcularSalario();
}
