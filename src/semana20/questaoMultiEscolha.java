package semana20;

import java.util.List;

class questaoMultiEscolha extends questao {
    
    private List<String> opcoes;
    private List<Integer> opcoesRespostas;

    public questaoMultiEscolha(int numero, String enunciado, List<String> opcoes, List<Integer> opcoesRespostas) {

        super(numero, enunciado);
        this.opcoes = opcoes;
        this.opcoesRespostas = opcoesRespostas;
    }

    public List<String> getOpcoes() {
        return opcoes;
    }

    public List<Integer> getOpcoesRespostas() {
        return opcoesRespostas;
    }
}
