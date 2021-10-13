public class Q5_principal_contato {

    public static void main(String[] args){

        Q5_contato roberto = new Q5_contato("Roberto", 992456787);

        roberto.enviar_mensagem("Olá, Roberto, tudo bem?");

        roberto.getQuant_naolidas();

        roberto.receber_mensagem("Estou bem!");
        roberto.receber_mensagem("E você?");
        roberto.receber_mensagem("E a familia?");
        roberto.receber_mensagem("Eu comprei um carro");
        roberto.receber_mensagem("Modelo novo, funcionando a energia solar");

        roberto.getQuant_naolidas();

        roberto.mensagensNaoLidas();

        roberto.getQuant_naolidas();
    }
}
