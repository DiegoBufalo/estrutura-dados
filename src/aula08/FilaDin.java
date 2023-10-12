package aula08;

public class FilaDin {
    class Nodo {
        char data;
        Nodo link;
    }

    Nodo front, rear;

    FilaDin() {
        front = rear = null;
    }

    void store(char elem) {
        Nodo nodo = new Nodo();
        nodo.data = elem;

        if (front == null) {
            front = nodo;
        } else if (rear == null) {
            rear = nodo;
        } else {
            Nodo aux = new Nodo();
            aux = front;
            while (aux != null) {
                if (aux.link == null) {
                    aux.link = rear;
                    break;
                }
                aux = aux.link;
            }

            rear = nodo;
        }
    }

    char retrieve() {
        char aux = front.data;
        front = front.link;
        return aux;
    }

    void destroy() {
        front = rear = null;
    }

    void mostra() {
        if (front == null && rear == null) {
            System.out.println("Fila vazia");
            return;
        }

        Nodo faux = front;
        int pos = 1;
        String s = "\nOrdem saída Fila:\n";
        while (faux != null) {
            s += pos + ": " + faux.data + "\n";
            faux = faux.link;
            pos++;
        }
        if (rear != null) {
            s += pos + ": " + rear.data + "\n";
        }

        System.out.println(s);
    }

    public static void main(String args[]) {
        FilaDin f1 = new FilaDin();
        f1.store('A');
        System.out.println("store incluiu: A");
        f1.store('B');
        System.out.println("store incluiu: B");
        f1.store('C');
        System.out.println("store incluiu: C");
        f1.store('D');
        System.out.println("store incluiu: D");
        f1.store('E');
        System.out.println("store incluiu: E");
        f1.mostra();
        System.out.println("retrieve retirou: " + f1.retrieve());
        System.out.println("retrieve retirou: " + f1.retrieve());
        System.out.println("retrieve retirou: " + f1.retrieve());
        f1.mostra();
        f1.store('F');
        System.out.println("store incluiu: F");
        f1.store('G');
        System.out.println("store incluiu: G");
        f1.mostra();
        System.out.println("retrieve retirou: " + f1.retrieve());
        f1.mostra();
        f1.destroy();
        System.out.println("Após destruir...");
        f1.mostra();
    }
}