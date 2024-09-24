public class Principal {
    public static void main(String[] args) {
        Questao q1 = new Questao();
        q1.pergunta="1-qual ano que eu naci ?";
        q1.opcaoA="a - 17";
        q1.opcaoB="b - 99";
        q1.opcaoC="c - 19";
        q1.opcaoD="d - 55";
        q1.opcaoE="e - 18";
        q1.correta="e";

        q1.escrevaQuestao();
        String resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

        //proxima questao


        Questao q1 = new Questao();
        q1.pergunta="1-qual ano que eu naci ?";
        q1.opcaoA="a - 17";
        q1.opcaoB="b - 99";
        q1.opcaoC="c - 19";
        q1.opcaoD="d - 55";
        q1.opcaoE="e - 18";
        q1.correta="e";

        q1.escrevaQuestao();
        resposta = q1.leiaResposta();
        q1.isCorreta(resposta);

    }
}
