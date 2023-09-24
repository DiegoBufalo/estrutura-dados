import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Aula04 {
    public static void main(String[] args) throws Exception {
        long mediaTempoBubble = 0;
        long mediaTempoSelection = 0;
        long mediaTempoInsertion = 0;

        int[] vetorBubble = new int[10000];
        int[] vetorSelection = new int[10000];
        int[] vetorInsertion = new int[10000];
       
        for (int i = 0; i <= 100; i++) {
            preencherAleatorio(vetorBubble);
            preencherAleatorio(vetorSelection);
            preencherAleatorio(vetorInsertion);

            long inicioBubble = System.nanoTime();
            bubbleSort(vetorBubble);
            mediaTempoBubble += System.nanoTime() - inicioBubble;
            

            long inicioSelection = System.nanoTime();
            selectionSort(vetorSelection);
            mediaTempoSelection += System.nanoTime() - inicioSelection;
            
            
            long inicioInsertion = System.nanoTime();
            insertionSort(vetorInsertion);
            mediaTempoInsertion += System.nanoTime() - inicioInsertion;
        }
    
        //média de tempo em ms
        System.out.println("Bubble: " + TimeUnit.NANOSECONDS.toMillis(mediaTempoBubble / 100));
        System.out.println("Selection: " + TimeUnit.NANOSECONDS.toMillis(mediaTempoSelection / 100));
        System.out.println("Insertion: " + TimeUnit.NANOSECONDS.toMillis(mediaTempoInsertion / 100));
    }

    public static void bubbleSort(int[] vet) {
        int iA, iB, iT;
        for (iA = 1; iA <vet.length; iA++) {
            for (iB = vet.length-1; iB >= iA; iB--) {
                if (vet[iB -1] > vet[iB]) {
                    iT = vet[iB - 1];
                    vet[iB-1] = vet[iB];
                    vet[iB] = iT; 
                }
            }
        }
    }

    public static void selectionSort(int[] vet) {
        int iA, iB, iC, iT;
        for (iA = 0; iA <vet.length - 1; iA++) {
            iC = iA;
            iT = vet[iA];
            for (iB = iA + 1; iB < vet.length; iB++) {
                if (vet[iB] < iT) {
                    iC = iB;
                    iT = vet[iB];
                }
            }
            vet[iC] = vet[iA];
            vet[iA] = iT;
        }
    }

    public static void insertionSort(int [] vet) {
        int iA, iB, iT;
        for (iA = 1; iA <vet.length; iA++) {
            iT = vet[iA];
            iB = iA-1;
            while(iB >= 0 && iT < vet[iB]) {
                vet[iB + 1] = vet[iB];
                iB--;
            }
            vet[iB + 1] = iT;
        }
    }

    public static long bubbleSortContagemComparacoes(int[] vet) {
        long lComp = 0;
        int iA, iB, iT;
        
        for (iA = 1; iA <vet.length; iA++) {
            lComp += 1;

            for (iB = vet.length-1; iB >= iA; iB--) {
                lComp += 1;
                
                lComp += 1;
                if (vet[iB -1] > vet[iB]) {
                    iT = vet[iB - 1];
                    vet[iB-1] = vet[iB];
                    vet[iB] = iT; 
                }
            }
        }

        return lComp;
    }

    public static long selectionSortContagemComparacoes(int[] vet) {
        long lComp = 0;
        int iA, iB, iC, iT;
        
        for (iA = 0; iA <vet.length - 1; iA++) {
            lComp += 1;

            iC = iA;
            iT = vet[iA];
            for (iB = iA + 1; iB < vet.length; iB++) {
                lComp += 1;
  
                lComp += 1;
                if (vet[iB] < iT) {
                    iC = iB;
                    iT = vet[iB];
                }
            }
            vet[iC] = vet[iA];
            vet[iA] = iT;
        }

        return lComp;
    }

    public static long insertionSortContagemComparacoes(int [] vet) {
        long lComp = 0;
        int iA, iB, iT;
        for (iA = 1; iA <vet.length; iA++) {
            lComp += 1;

            iT = vet[iA];
            iB = iA-1;
            while(iB >= 0 && iT < vet[iB]) {
                lComp += 1;

                vet[iB + 1] = vet[iB];
                iB--;
            }
            vet[iB + 1] = iT;
        }

        return lComp;
    }

    public static long bubbleSortContagemAtribuicoes(int[] vet) {
        long lAtri = 0;
        int iA, iB, iT;
        
        for (iA = 1; iA <vet.length; iA++) {
            for (iB = vet.length-1; iB >= iA; iB--) {
                if (vet[iB -1] > vet[iB]) {
                    iT = vet[iB - 1];
                    vet[iB-1] = vet[iB];
                    vet[iB] = iT; 
                    
                    lAtri += 3;
                }
                lAtri += 1;
            }
            lAtri += 1;
        }

        return lAtri;
    }

    public static long selectionSortContagemAtribuicoes(int[] vet) {
        long lAtri = 0;
        int iA, iB, iC, iT;
        
        for (iA = 0; iA <vet.length - 1; iA++) {
            lAtri += 2;
            iC = iA;
            iT = vet[iA];
            for (iB = iA + 1; iB < vet.length; iB++) {
                if (vet[iB] < iT) {
                    lAtri += 2;
                    iC = iB;
                    iT = vet[iB];
                }

                lAtri += 1;
            }

            lAtri += 2;
            vet[iC] = vet[iA];
            vet[iA] = iT;

            lAtri += 1;
        }

        return lAtri;
    }

    public static long insertionSortContagemAtribuicoes(int [] vet) {
        long lAtri = 0;
        int iA, iB, iT;
        for (iA = 1; iA <vet.length; iA++) {
            lAtri += 2;
            iT = vet[iA];
            iB = iA-1;
            while(iB >= 0 && iT < vet[iB]) {
                lAtri += 2;
                vet[iB + 1] = vet[iB];
                iB--;
            }

            lAtri += 1;
            vet[iB + 1] = iT;
        }

        return lAtri;
    }

    public static void bubbleSortReverso(int[] vet) {
        int iA, iB, iT;
        for (iA = 0; iA < vet.length - 1; iA++) {
            for (iB = vet.length - 1; iB > iA; iB--) {
                if (vet[iB - 1] < vet[iB]) {
                    iT = vet[iB - 1];
                    vet[iB - 1] = vet[iB];
                    vet[iB] = iT;
                }
            }
        }
    }

    public static void selectionSortReverso(int[] vet) {
        int iA, iB, iC, iT;
        for (iA = 0; iA < vet.length - 1; iA++) {
            iC = iA;
            iT = vet[iA];
            for (iB = iA + 1; iB < vet.length; iB++) {
                if (vet[iB] > iT) {
                    iC = iB;
                    iT = vet[iB];
                }
            }
            vet[iC] = vet[iA];
            vet[iA] = iT;
        }
    }
    
    public static void insertionSortReverso(int[] vet) {
        int iA, iB, iT;
        for (iA = 1; iA < vet.length; iA++) {
            iT = vet[iA];
            iB = iA - 1;
            while (iB >= 0 && iT > vet[iB]) {
                vet[iB + 1] = vet[iB];
                iB--;
            }
            vet[iB + 1] = iT;
        }
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

    public static void preencherAleatorio (int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100000000);
        }
    }
}
