package pilhaFila;
public class FilaPrior {

    private FilaChar f1, f2, f3;

    FilaPrior(int tamanho) {
        f1 = new FilaChar(tamanho);
        f2 = new FilaChar(tamanho);
        f3 = new FilaChar(tamanho);
    }

    boolean isfull() {
        // Retorna verdadeiro se uma das três filas está cheia
        return f1.isfull() || f2.isfull() || f3.isfull();
    }

    boolean isempty() {
        // Retorna verdadeiro se as três filas estiverem vazias
        return f1.isempty() && f2.isempty() && f3.isempty();
    }

    void inclui(char elem, int prior) {
        // Código que inclui o elemento "elem" na fila correta segundo a prioridade
        // informada.
        switch (prior) {
            case 1:
                f1.store(elem);
                break;
            case 2:
                f2.store(elem);
                break;
            case 3:
                f3.store(elem);
                break;
            default:
            System.out.println("Prioridade invalida");
                break;
        }
    }

    char retira() {
        // Código que retira o elemento existente de maior prioridade.
        char elem = ' ';
        if (this.isempty()) return elem;
        else if (!f3.isempty()) elem = f3.retrieve(); 
        else if (!f2.isempty()) elem = f2.retrieve();
        else elem = f1.retrieve();

        return elem;
    }

    public static void main(String[] args) {

        System.out.println("criando uma fila de Prioridades com 5 elementos em cada prioridade...");
        FilaPrior fp1 = new FilaPrior(5);
        System.out.println("verificando status da fila...");
        System.out.println("esta vazia? " + fp1.isempty());
        System.out.println("esta cheia? " + fp1.isfull());
        System.out.println("incluindo o caractere A na prioridade 2...");
        fp1.inclui('A', 2);
        System.out.println("verificando status da fila...");
        System.out.println("esta vazia? " + fp1.isempty());
        System.out.println("esta cheia? " + fp1.isfull());
        System.out.println("incluindo o caractere B na prioridade 1...");
        fp1.inclui('B', 1);
        System.out.println("incluindo o caractere C na prioridade 3...");
        fp1.inclui('C', 3);
        System.out.println("incluindo o caractere D na prioridade 3...");
        fp1.inclui('D', 3);
        System.out.println("incluindo o caractere E na prioridade 1...");
        fp1.inclui('E', 1);
        System.out.println("incluindo o caractere F na prioridade 2...");
        fp1.inclui('F', 2);
        System.out.println("incluindo o caractere G na prioridade 1...");
        fp1.inclui('G', 1);
        System.out.println("realizando  retrieves na sequencia...");
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println(fp1.retira());
        System.out.println("verificando status da fila...");
        System.out.println("esta vazia? " + fp1.isempty());
        System.out.println("esta cheia? " + fp1.isfull());
    }

}