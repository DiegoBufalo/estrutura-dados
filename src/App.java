import java.util.Arrays;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    int[] vetorSelection = new int[10];
    preencherAleatorio(vetorSelection);
    selectionSortRecursivo(vetorSelection, 0);
    System.out.println(Arrays.toString(vetorSelection));
  }

  public static void selectionSortRecursivo(int[] vet, int inicio) {
    if (inicio >= vet.length - 1) {
      return;
    }

    int minIndex = inicio;
    for (int i = inicio + 1; i < vet.length; i++) {
      if (vet[i] < vet[minIndex]) {
        minIndex = i;
      }
    }

    int temp = vet[inicio];
    vet[inicio] = vet[minIndex];
    vet[minIndex] = temp;

    selectionSortRecursivo(vet, inicio + 1);
  }

  public static void preencherAleatorio(int[] vetor) {
    Random random = new Random();
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(1000);
    }
  }
}