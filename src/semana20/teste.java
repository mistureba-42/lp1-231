package semana20;

import java.util.ArrayList;
import java.util.List;

public class teste {
    public static void main(String[] args) {

        questaoV_F qVF = new questaoV_F(1, "Java é uma linguagem de programação.", true);
        
        List<String> q1Eopcoes = new ArrayList<>();
        q1Eopcoes.add("A) Verdadeiro");
        q1Eopcoes.add("B) Falso");
        questao1Escolha q1E = new questao1Escolha(2, "Qual das opções abaixo é verdadeira?", q1Eopcoes, 0);

        List<String> qMEOpcoes = new ArrayList<>();
        qMEOpcoes.add("A) Opção A");
        qMEOpcoes.add("B) Opção B");
        qMEOpcoes.add("C) Opção C");
        List<Integer> qMEOpcoesRespostas = new ArrayList<>();
        qMEOpcoesRespostas.add(0);
        qMEOpcoesRespostas.add(2);
        questaoMultiEscolha qME = new questaoMultiEscolha(3, "Selecione as opções corretas:", qMEOpcoes, qMEOpcoesRespostas);

        prova prova = new prova();
        prova.addQuestao(qVF);
        prova.addQuestao(q1E);
        prova.addQuestao(qME);

        int pontuacaoTotal = prova.calculatePontuacaoTotal();
        System.out.println("Pontuação total da prova: " + pontuacaoTotal + " pontos");
    }
}