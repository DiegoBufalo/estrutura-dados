package pilhaFilaDeque;

public class CircularDeque {
    private Integer[] deque;
    private int tamanhoMaximo;
    private int frente;
    private int cauda;
    private int tamanho;

    public CircularDeque(int maxSize) {
        this.tamanhoMaximo = maxSize;
        this.deque = new Integer[maxSize];
        this.frente = 0;
        this.cauda = 0;
        this.tamanho = 0;
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public boolean isFull() {
        return tamanho == tamanhoMaximo;
    }

    public static CircularDeque create(int tamanho) {
        return new CircularDeque(tamanho);
    }

    public void incDequeIni(Integer item) {
        if (!isFull()) {
            frente = (frente - 1 + tamanhoMaximo) % tamanhoMaximo;
            deque[frente] = item;
            tamanho++;
        } else {
            System.out.println("Deque está cheio e não pode adicionar elementos");
        }
    }

    public void incDequeFim(Integer item) {
        if (!isFull()) {
            deque[cauda] = item;
            cauda = (cauda + 1) % tamanhoMaximo;
            tamanho++;
        } else {
            System.out.println("Deque está cheio e não pode adicionar elementos");
        }
    }

    public Integer retDequeIni() {
        if (!isEmpty()) {
            Integer item = (Integer) deque[frente];
            frente = (frente + 1) % tamanhoMaximo;
            tamanho--;
            return item;
        } else {
            System.out.println("Deque está vazio e não pode retirar elementos.");
            return null;
        }
    }

    public Integer retDequeFim() {
        if (!isEmpty()) {
            cauda = (cauda - 1 + tamanhoMaximo) % tamanhoMaximo;
            Integer item = (Integer) deque[cauda];
            tamanho--;
            return item;
        } else {
            System.out.println("Deque está vazio e não pode retirar elementos.");
            return null;
        }
    }

    public void destroy() {
        frente = 0;
        cauda = 0;
        tamanho = 0;
        deque = new Integer[tamanhoMaximo];
    }

    public void next() {
        frente = (frente + 1) % tamanhoMaximo;
    }

    public void prev() {
        frente = (frente - 1 + tamanhoMaximo) % tamanhoMaximo;
    }

    public int size() {
        return tamanho;
    }

    public void display() {
        if (tamanho == 0) {
            System.out.println("Deque está vazio");
        }

        int i = frente;
        for (int count = 0; count < tamanho; count++) {
            System.out.print(deque[i] + " ");
            i = (i + 1) % tamanhoMaximo;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularDeque deque = new CircularDeque(5);

        deque.incDequeIni(1);
        deque.incDequeFim(2);
        deque.incDequeFim(3);
        deque.incDequeIni(0);

        deque.display(); // Deve imprimir: 0 1 2 3

        deque.prev();
        deque.next();

        deque.retDequeIni();
        deque.retDequeFim();

        deque.display(); // Deve imprimir: 1 2

        deque.destroy();

        deque.display(); // Deve imprimir: (vazio)
    }
}
