package semana20;

import java.util.List;

class questao1Escolha extends questao {

    private List<String> opcoes;
    private int opcaoResposta;

    public questao1Escolha(int numero, String enunciado, List<String> opcoes, int opcaoResposta) {

        super(numero, enunciado);
        this.opcoes = opcoes;
        this.opcaoResposta = opcaoResposta;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public int getOpcaoResposta() {
        return opcaoResposta;
    }
}