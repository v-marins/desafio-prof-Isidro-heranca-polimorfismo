package br.com.piBank;

import java.util.Scanner;

public class AppBanco {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Conta c1, c2;

        c1 = new Conta("Camila", "452.856.478-99", 1001,500f);
        c2 = new ContaEspecial("Rafaela", "542.333.457-91",2001,200,200);

        // fazer compra conta comum:
        System.out.println(c1);
        System.out.println("Insira o valor da compra: ");
        if(c1.Debitar(scan.nextFloat())){
            System.out.println("Compra efetuada!");
            System.out.println(c1);
        }

        // fazer compra conta VIP:
        System.out.println(c2);
        System.out.println("Insira o valor da compra: ");
        if(c2.Debitar(scan.nextFloat())){
            System.out.println("Compra efetuada!");
            System.out.println(c2);
        }

    }
}
