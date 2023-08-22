package semana20;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {

        questaoV_F qVF = new questaoV_F(1, "Java é uma linguagem de programação.", true);
        
        List<String> scOpcoes = new ArrayList<>();
        scOpcoes.add("A) Verdadeiro");
        scOpcoes.add("B) Falso");
        questao1Escolha q1E = new questao1Escolha(2, "Qual das opções abaixo é verdadeira?", scOpcoes, 0);

        List<String> mcOpcoes = new ArrayList<>();
        mcOpcoes.add("A) Opção A");
        mcOpcoes.add("B) Opção B");
        mcOpcoes.add("C) Opção C");
        List<Integer> mcCorrectIndices = new ArrayList<>();
        mcCorrectIndices.add(0);
        mcCorrectIndices.add(2);
        questaoMultiEscolha qME = new questaoMultiEscolha(3, "Selecione as opções corretas:", mcOpcoes, mcCorrectIndices);

        prova prova = new prova();
        prova.addQuestao(qVF);
        prova.addQuestao(q1E);
        prova.addQuestao(qME);

        int pontuacaoTotal = prova.calculatePontuacaoTotal();
        System.out.println("Pontuação total da prova: " + pontuacaoTotal + " pontos");
    }
}