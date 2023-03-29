import java.util.Scanner;

public class MainAula20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int escolha = 0;

        while (escolha >= 0) {
            System.out.println(
                    " Digite o numero limite para para o calculo da soma utilizando iteracao e recursao \n digite -1 para sair");

            escolha = sc.nextInt();

            if (escolha >= 0) {
                clearBoard();
                System.out.println("Soma iterativa: " + somaIterativa(escolha));
                System.out.println("Soma recursiva: " + somaRecursiva(escolha));
                System.out.println("----------------------------------------");
            }
        }

        sc.close();
    }

    public static int somaIterativa(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        return soma;
    }

    public static int somaRecursiva(int n) {
        if (n <= 1) {
            return n;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }

    private static void clearBoard() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
