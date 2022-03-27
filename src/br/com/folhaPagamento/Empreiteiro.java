package br.com.folhaPagamento;

public class Empreiteiro extends Funcionario{

    private float valorEmpreita;

    public Empreiteiro(String nome, int numRegistro, float valorEmpreita) {
        super(nome, numRegistro);
        this.valorEmpreita = valorEmpreita;
    }

    public float getValorEmpreita() {
        return valorEmpreita;
    }

    public void setValorEmpreita(float valorEmpreita) {
        this.valorEmpreita = valorEmpreita;
    }

    @Override
    public float CalcularSalario() {
        return valorEmpreita;
    }
}
