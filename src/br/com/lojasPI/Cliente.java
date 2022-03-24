package br.com.lojasPI;

public class Cliente {

    private String nome;
    private String email;
    private float credito;

    public Cliente(String nome, String email, float credito) {
        this.nome = nome;
        this.email = email;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }

    public String toString(){
        return "Cliente: "+nome+" ("+email+") R$: "+credito;
    }

    public boolean fazerCompra(float valor){
        if (valor > credito){
            return false;
        }else{
            credito -= valor;
            return true;
        }
    }

    public void quitarDivida(float valor){
        credito += valor;
    }




}
