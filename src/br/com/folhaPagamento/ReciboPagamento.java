package br.com.folhaPagamento;

public class ReciboPagamento {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Chefe("Josue",1,5000f,200f,500);
        funcionarios[1] = new Comissionado("Pedro",2,2000f,200);
        funcionarios[2] = new Horista("Julio",3,50f,8);
        funcionarios[3] = new Empreiteiro("João", 4,1500f);

        System.out.println("###### Recibo de Salário #######");
        for(Funcionario i:funcionarios) {
            System.out.println("Nome: "+i.getNome()+", Registro: "+i.getNumRegistro()+", Salário: "+i.CalcularSalario());
        }

    }
}
