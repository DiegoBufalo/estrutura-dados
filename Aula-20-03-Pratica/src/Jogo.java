import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private int vitorias = 0;
    private String[] opcoes = new String[] { "Pedra", "Papel", "Tesoura" };

    public void NovoJogo(Personagem jogador) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        clearBoard();
        while (jogador.getLife() > 0 && this.vitorias < 5) {
            System.out.println("******************************");
            System.out.println("**** Vamos começar o jogo ****");
            System.out.println("********  Score: " + this.vitorias + " *********");
            System.out.println("********  Life: " + jogador.getLife() + " *********");
            System.out.println("******************************");
            System.out.println("");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("");
            System.out.println("******************************");
            System.out.println("");
            System.out.print("Escolha uma opção: ");

            int escolhaPersonagem = sc.nextInt();
            if (escolhaPersonagem > 3 || escolhaPersonagem < 1) {
                clearBoard();
                System.out.println("Opção inválida");
                continue;
            }

            int escolhaComputador = random.nextInt(3);

            clearBoard();
            System.out.println("******************************");
            System.out.println(jogador.getNome() + " : " + this.opcoes[escolhaPersonagem - 1]);
            System.out.println("Computador : " + this.opcoes[escolhaComputador]);

            if (escolhaComputador == escolhaPersonagem - 1) {
                System.out.println("Empatamos " + jogador.getNome() + "!!!");
            } else if ((escolhaComputador == 0 && escolhaPersonagem == 3) ||
                    (escolhaComputador == 1 && escolhaPersonagem == 1) ||
                    (escolhaComputador == 2 && escolhaPersonagem == 2)) {
                System.out.println("Você perdeu " + jogador.getNome() + "!!!");
                jogador.retirarVida();
                System.out.println("********  Life: " + jogador.getLife() + " *********");
            } else {
                System.out.println(jogador.getNome() + " você ganhou!!!!");
                this.vitorias += 1;
            }
            System.out.println("******************************");
        }

        sc.close();

        if (!jogador.estaVivo())
            System.out.println("Game Over! você perdeu todas as suas vidas");
        else
            System.out.println("Parabens " + jogador.getNome() + " você ganhou 5vezes");

    }

    // clear console
    private static void clearBoard() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
