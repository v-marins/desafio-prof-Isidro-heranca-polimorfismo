package br.com.univerPI;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        QuestaoSimples[] perguntas = new QuestaoSimples[5];

        perguntas[0] = new QuestaoSimples("Quem descobriu o Brasil?","Pedro Alvares Cabral");
        perguntas[1] = new QuestaoME("Qual a cor do cavalo branco do Napoleão","a","Branco","Amarelo","Preto","Malhado");
        perguntas[2] = new QuestaoComDica("Qual o nome do curso?","Java","Começa com Ja e termina com va");
        perguntas[3] = new QuestaoSimples("Qual a fórmula da água?","H2O");
        perguntas[4] = new QuestaoME("Qual o jogo favorito do Professor?","c","Mario","Zelda","MegaMan","MortalKombat");

        int pontos = 0;

        System.out.println("####### Teste da UniverPI #######");

        for(int i =0; i < perguntas.length; i++){
            System.out.println(perguntas[i].aplicarQuestao());
            System.out.println("Sua resposta: ");
            String resposta = scan.nextLine();
            if(perguntas[i].corrigir(resposta)){
                pontos+=2;
            }
        }

        System.out.println("Sua nota final é: "+pontos);

    }
}
