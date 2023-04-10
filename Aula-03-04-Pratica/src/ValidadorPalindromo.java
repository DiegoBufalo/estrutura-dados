import java.util.Scanner;

public class ValidadorPalindromo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase para verificar se é um palíndromo:");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-záàâãéèêíïóôõöúçñ]", "");
        boolean isPalindrome = true;
        int length = input.length();

        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("A sequência fornecida é um palíndromo!");
        } else {
            System.out.println("A sequência fornecida não é um palíndromo.");
        }
    }

}
