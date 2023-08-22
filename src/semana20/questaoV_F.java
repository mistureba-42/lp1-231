package semana20;

public class questaoV_F extends questao {

    private boolean resposta;

    public questaoV_F(int numero, String enunciado, boolean resposta) {
        super(numero, enunciado);
        this.resposta = resposta;
    }

    public boolean isResposta() {
        return resposta;
    }
}