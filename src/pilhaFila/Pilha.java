package pilhaFila;
public class Pilha {
    private Object[] vetor;
    private int pos = 0;
    private int length = 0;

    public Pilha(int size) {
        length = size;
        this.vetor = new Object[size];
    }

    public int size() {
        int size = 0;
        for(int i = 0; i < this.size(); i++) {
            if (vetor[i] != null) size++;
        }

        return size;
    }

    public boolean isEmpty() {
        return this.size() == 0;
    }

    public boolean contains(Object o) {
        boolean contais = false;
        for(int i = 0; i < this.size(); i++) {
            if (vetor[i] == o) {
                contais = true;
                break;
            }
        }

        return contais;
    }

    public void clear() {
        for(int i = 0; i < this.size(); i++) {
            vetor[i] = null;
        }
    }

    public boolean isFull() {
        return this.size() == this.length;
    }

    public void push(Object obj) {
        if (this.isFull()) throw new StackOverflowError("esta pilha se encontra cheia");

        vetor[pos] = obj;
        pos++;
    }

    public void pop() {
        vetor[pos - 1] = null;
        pos--;
    }

    public Object top() {
        if (isEmpty()) throw new StackOverflowError("esta pilha se encontra vazio");
        return vetor[pos];
    }

    public void print() {
        for(int i = 0; i < this.size(); i++) {
            if (vetor[i] != null)
                System.out.print(vetor[i] + ", ");
        }

        System.out.println("\n");
    }
}
