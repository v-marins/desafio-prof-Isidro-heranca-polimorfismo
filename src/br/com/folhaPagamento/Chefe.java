package br.com.folhaPagamento;

public class Chefe extends Funcionario{

    private float salarioBase;
    private float adicional;
    private float beneficioTerno;

    public Chefe(String nome, int numRegistro, float salarioBase, float adicional, float beneficioTerno) {
        super(nome, numRegistro);
        this.salarioBase = salarioBase;
        this.adicional = adicional;
        this.beneficioTerno = beneficioTerno;
    }

    public float getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public float getAdicional() {
        return adicional;
    }

    public void setAdicional(float adicional) {
        this.adicional = adicional;
    }

    public float getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(float beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    @Override
    public float CalcularSalario() {
        return salarioBase + (salarioBase * adicional / 100) + beneficioTerno;
    }


}
