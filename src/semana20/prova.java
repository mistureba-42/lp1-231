package semana20;

import java.util.ArrayList;
import java.util.List;

public class prova<Questao> {
    
    
    private List<Questao> questoes;

    public prova() {
        questoes = new ArrayList<>();
    }

    public void addQuestao(Questao questao) {
        questoes.add(questao);
    }

    public int calculatePontuacaoTotal() {
        return questoes.size();
    }
}