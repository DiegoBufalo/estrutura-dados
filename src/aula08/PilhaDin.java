package aula08;

public class PilhaDin {

    class Nodo {
        char data;
        Nodo link;
    }

    Nodo topo;

    PilhaDin() {
        topo = null;
    }

    void push(char elem) {
        Nodo novo = new Nodo();
        novo.data = elem;
        novo.link = topo;
        topo = novo;
    }

    char pop() {
        char aux = topo.data;
        topo = topo.link;
        return aux;
    }

    char top() {
        char aux = topo.data;
        return aux;
    }

    void destroy() {
        topo = null;
    }

    void mostra() {
        if (topo == null) {
            System.out.println("Pilha vazia!");
            return;
        }

        Nodo aux = new Nodo();
        aux = topo;
        System.out.println("Pilha: \n");
        while (aux != null) {
            System.out.print(aux.data + " ");
            aux = aux.link;
        }
        System.out.println("\n");
    }

    public static void main(String args[]) {
        PilhaDin p1 = new PilhaDin();
        p1.push('A');
        System.out.println("push incluiu: A");
        p1.push('B');
        System.out.println("push incluiu: B");
        p1.push('C');
        System.out.println("push incluiu: C");
        p1.push('D');
        System.out.println("push incluiu: D");
        p1.push('E');
        System.out.println("push incluiu: E");
        p1.mostra();
        System.out.println("pop retirou: " + p1.pop());
        System.out.println("pop retirou: " + p1.pop());
        System.out.println("pop retirou: " + p1.pop());
        p1.mostra();
        p1.push('F');
        System.out.println("push incluiu: F");
        p1.push('G');
        System.out.println("push incluiu: G");
        p1.mostra();
        System.out.println("pop retirou: " + p1.pop());
        p1.mostra();
        p1.destroy();
        System.out.println("Após destruir...");
        p1.mostra();
    }
}