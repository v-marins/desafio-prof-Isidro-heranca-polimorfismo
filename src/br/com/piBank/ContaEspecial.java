package br.com.piBank;

public class ContaEspecial extends Conta{

    private float limite;

    public ContaEspecial(String nome, String cpf, int numConta, float saldo, float limite) {
        super(nome, cpf, numConta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
    @Override
    public String toString() {
        return "***** VIP *****"+"\n"+
                super.toString() + "\n"+
                "Crédito Especial: "+limite+"\n"+
                "*********************";
    }

    @Override
    public boolean Debitar(float valor) {
        if(valor <= getSaldo() + limite){
            setSaldo(getSaldo() - valor);
            return true;
        }else{
            System.out.println("Saldo insuficiente.");
            return false;
        }
    }
}
