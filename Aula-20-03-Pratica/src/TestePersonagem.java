public class TestePersonagem {

    public static void main(String[] args) {
        Personagem p1 = new Personagem("Huguinho", 8, "não binário");
        Jogo jogo = new Jogo();
        jogo.NovoJogo(p1);
    }

}
