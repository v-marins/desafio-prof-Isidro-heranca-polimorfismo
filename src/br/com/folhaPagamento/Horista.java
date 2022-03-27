package br.com.folhaPagamento;

public class Horista extends Funcionario{

    private float valorHora;
    private int numeroHoras;

    public Horista(String nome, int numRegistro, float valorHora, int numeroHoras) {
        super(nome, numRegistro);
        this.valorHora = valorHora;
        this.numeroHoras = numeroHoras;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    @Override
    public float CalcularSalario() {
        return valorHora * numeroHoras;
    }
}
