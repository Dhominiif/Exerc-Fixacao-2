public class Q5_principal_contato {

    public static void main(String[] args){

        Q5_contato Breno = new Q5_contato("Breno Leonardo Gomes de Menezes Araujo", 992456787);

        Breno.enviar_mensagem("Professor, se eu te colocar no meu trabalho, eu ganho ponto?");

        Breno.getQuant_naolidas();

        Breno.receber_mensagem("Não!");
        Breno.receber_mensagem("Que logica é essa?");
        Breno.receber_mensagem("Você só fez a sua obrigacao");
        Breno.receber_mensagem("Se tentar ganhar ponto facil...");
        Breno.receber_mensagem("...Será reprovado");

        Breno.getQuant_naolidas();

        Breno.mensagensNaoLidas();

        Breno.getQuant_naolidas();
    }
}
