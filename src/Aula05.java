import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Aula05 {

    private static int compQuick = 0;
    private static int atriQuick = 0;
    private static int compMerge = 0;
    private static int atriMerge = 0;

    public static void main(String args[]) {
        long inicioQuick = System.nanoTime();
        for(int i = 1; i <= 6; i++) {
            int arrQuick[] = new int[(int) Math.pow(i, i)];
            preencherAleatorio(arrQuick);
		    int nQ = arrQuick.length;
		    quickSort(arrQuick, 0, nQ-1);
        }
        long media = System.nanoTime() - inicioQuick;
        System.out.println(String.format("Tempo médio quick sort: %d ms",TimeUnit.NANOSECONDS.toMillis(media)));
        System.out.println("quantidade comparações quick: " + compQuick);
        System.out.println("quantidade atribuições quick: " + atriQuick);
    
        long inicioMerge = System.nanoTime();
        for(int i = 1; i <= 6; i++) {

            int arrMerge[] = new int[(int) Math.pow(i, i)];
            preencherAleatorio(arrMerge);
            int nM = arrMerge.length;
            mergeSort(arrMerge, nM);
        }
        long media1 = System.nanoTime() - inicioMerge;
        System.out.println(String.format("Tempo médio merge sort: %d ms",TimeUnit.NANOSECONDS.toMillis(media1)));
        System.out.println("quantidade comparações merge: " + compMerge);
        System.out.println("quantidade atribuições merge: " + atriMerge);
	}

	public static void quickSort(int arr[], int low, int high) {
		compQuick+= 1;
        if (low < high) {
            atriQuick+= 1;
            int pivot = arr[high];
            atriQuick+= 1;
            int i = (low-1); 
            
            for (int j=low; j<high; j++) {
                compQuick+= 1;

                compQuick+= 1;
                if (arr[j] <= pivot){
                    i++;

                    atriQuick+= 1;
                    int temp = arr[i];
                    
                    atriQuick+= 1;
                    arr[i] = arr[j];
                    
                    atriQuick+= 1;
                    arr[j] = temp;
                }
		    }

            atriQuick+= 1;
            int temp = arr[i+1];
            
            atriQuick+= 1;
            arr[i+1] = arr[high];
            
            atriQuick+= 1;
            arr[high] = temp;
        
            i++;

			quickSort(arr, low, i-1);
			quickSort(arr, i+1, high);
		}
	}

    public static void mergeSort(int[] a, int n) {
        if (n < 2) {
            compMerge+= 1;
            return;
        }

        atriMerge+= 1;
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        
        for (int i = 0; i < mid; i++) {
            compMerge+= 1;
            atriMerge+= 1;
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            compMerge+= 1;
            atriMerge+= 1;
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(a, l, r, mid, n - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            compMerge+= 2;

            compMerge+= 1;
            if (l[i] <= r[j]) {
                atriMerge+= 1;
                a[k++] = l[i++];
            }
            else {
                atriMerge+= 1;
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            compMerge+= 1;
            atriMerge+= 1;
            a[k++] = l[i++];
        }
        while (j < right) {
            compMerge+= 1;
            atriMerge+= 1;
            a[k++] = r[j++];
        }
    }


    // ----------------------------------------------------------------
    public static void quickSortReverso(int arr[], int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = (low - 1);
    
            for (int j = low; j < high; j++) {
                if (arr[j] >= pivot) { // Modificação aqui: troque <= por >=
                    i++;
    
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
    
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;
    
            i++;
    
            quickSortReverso(arr, low, i - 1);
            quickSortReverso(arr, i + 1, high);
        }
    }

    public static void mergeSortReverso(int[] a, int n) {
        if (n < 2) {
            return;
        }
    
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
    
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSortReverso(l, mid);
        mergeSortReverso(r, n - mid);
    
        mergeReverso(a, l, r, mid, n - mid);
    }
    
    public static void mergeReverso(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] >= r[j]) { // Modificação aqui: troque <= por >=
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

	static void printArray(int arr[]) {        
		int n = arr.length;
		for (int i=0; i<n; ++i)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

    public static void preencherAleatorio (int[] vetor) {
        Random random = new Random();
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100000);
        }
    }
}
