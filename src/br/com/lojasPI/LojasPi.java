package br.com.lojasPI;

public class LojasPi {

    public static void main(String[] args) {

        Cliente[] clientes = new Cliente[5];

        clientes[0] = new Cliente("Paulo","paulo@paulo.com.br",500);
        clientes[1] = new ClienteVip("Vitor", "vitor@vitor.com.br",500,300);
        clientes[2] = new Cliente("Jose","jose@jo.com.br",300);
        clientes[3] = new Cliente("Rafael","rafael@rafa.com.br",1000);
        clientes[4] = new ClienteVip("Andre","andre@and.com.br",500,500);

        for (Cliente i: clientes) {
            System.out.println(i);
        }

        // Fazendo compras.
        for (Cliente i: clientes) {
            if (i.fazerCompra(650)){
                System.out.println("Compra foi efetuada!");
            }else{
                System.out.println("Compra não efetuada!");
            }
        }
    }
}
