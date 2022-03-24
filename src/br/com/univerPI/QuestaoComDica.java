package br.com.univerPI;

public class QuestaoComDica extends QuestaoSimples{
    private String dica;

    public QuestaoComDica(String enunciado, String resposta, String dica){
        super(enunciado,resposta);
        this.dica = dica;
    }

    @Override
    public String aplicarQuestao() {
        return "P: "+enunciado+"\n"+
                "(DICA) "+dica;
    }

}
