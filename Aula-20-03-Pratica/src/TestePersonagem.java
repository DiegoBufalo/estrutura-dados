import java.util.Random;
import java.util.Scanner;

public class TestePersonagem {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        Personagem p1 = new Personagem("Huguinho", 8, "não binário");
        int vitorias = 0;
        String[] opcoes = new String[] { "Pedra", "Papel", "Tesoura" };

        clearConsole();
        while (p1.getLife() > 0 && vitorias < 5) {
            System.out.println("******************************");
            System.out.println("**** Vamos começar o jogo ****");
            System.out.println("********  Score: " + vitorias + " *********");
            System.out.println("********  Life: " + p1.getLife() + " *********");
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
                clearConsole();
                System.out.println("Opção inválida");
                continue;
            }

            int escolhaComputador = random.nextInt(3);

            clearConsole();
            System.out.println("******************************");
            System.out.println(p1.getNome() + " : " + opcoes[escolhaPersonagem - 1]);
            System.out.println("Computador : " + opcoes[escolhaComputador]);

            if (escolhaComputador == escolhaPersonagem - 1) {
                System.out.println("Empatamos " + p1.getNome() + "!!!");
            } else if ((escolhaComputador == 0 && escolhaPersonagem == 3) ||
                    (escolhaComputador == 1 && escolhaPersonagem == 1) ||
                    (escolhaComputador == 2 && escolhaPersonagem == 2)) {
                System.out.println("Você perdeu " + p1.getNome() + "!!!");
                p1.retirarVida();
                System.out.println("********  Life: " + p1.getLife() + " *********");
            } else {
                System.out.println(p1.getNome() + " você ganhou!!!!");
                vitorias += 1;
            }
            System.out.println("******************************");
        }

        sc.close();

        if (!p1.estaVivo())
            System.out.println("Game Over! você perdeu todas as suas vidas");
        else
            System.out.println("Parabens " + p1.getNome() + " você ganhou 5vezes");

    }

    // clear console
    private static void clearConsole() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
