public class Q5_principal_contato {

    public static void main(String[] args){

        Q5_contato roberto = new Q5_contato("Breno Gama", 992456787);

        roberto.enviar_mensagem("Professor, se eu te colocar no meu trabalho, eu ganho ponto?");

        roberto.getQuant_naolidas();

        roberto.receber_mensagem("Não!");
        roberto.receber_mensagem("Que logica é essa?");
        roberto.receber_mensagem("Você só fez a sua obrigacao");
        roberto.receber_mensagem("Se tentar ganhar ponto facil...");
        roberto.receber_mensagem("...Será reprovado");

        roberto.getQuant_naolidas();

        roberto.mensagensNaoLidas();

        roberto.getQuant_naolidas();
    }
}
