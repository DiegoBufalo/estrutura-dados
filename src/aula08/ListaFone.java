package aula08;

class ListaFone {

    class Node {
        String nome;
        String fone;
        Node link;

        Node(String nome, String fone) {
            this.nome = nome;
            this.fone = fone;
        }

        Node() {
        }
    }

    Node l;

    ListaFone() {
        l = null;
    }

    void IncListaFone(String nm, String fn) {
        Node node = new Node(nm, fn);

        if (l == null) {
            l = node;
        } else {
            Node aux = new Node();
            aux = l;
            while (aux != null) {
                if (aux.link == null) {
                    aux.link = node;
                    break;
                }
                aux = aux.link;
            }
        }
    }

    String BuscaFone(String nm) {
        Node aux = new Node();
        aux = l;
        while (aux != null) {
            if (aux.nome.equalsIgnoreCase(nm)) {
                return aux.fone;
            }
            aux = aux.link;
        }
        return "Não encontrado";
    }

    void RetListaFone(String nm) {
        Node aux = l;
        Node prev = null;

        while (aux != null && !aux.nome.equalsIgnoreCase(nm)) {
            prev = aux;
            aux = aux.link;
        }

        if (aux == null) {
            System.out.println("Nome não encontrado na lista: " + nm);
            return;
        }

        // Se o nó é o primeiro da lista
        if (prev == null) {
            l = aux.link;
        } else {
            // Caso contrário
            prev.link = aux.link;
        }
    }

    void listar() {
        Node laux = l;
        String s = "\nLista:\n";
        while (laux != null) {
            s += laux.nome + " " + laux.fone + "\n";
            laux = laux.link;
        }
        s += "fim";
        System.out.println(s);
    }

    public static void main(String args[]) {
        ListaFone l1 = new ListaFone();
        l1.IncListaFone("Marcelo", "011 9999999");
        l1.IncListaFone("Fernando", "011 8888888");
        l1.IncListaFone("Marcio", "011 7777777");
        l1.IncListaFone("Gustavo", "011 6666666");
        l1.listar();
        l1.RetListaFone("Marcio");
        l1.listar();
        
        System.out.println("Telefone do Marcelo: " + l1.BuscaFone("Marcelo"));
        System.out.println("Telefone do Fernando: " + l1.BuscaFone("Fernando"));
        System.out.println("Telefone do Gustavo: " + l1.BuscaFone("Gustavo"));
        System.out.println("Telefone do Marcio: " + l1.BuscaFone("Marcio"));
        l1.RetListaFone("Marcelo");
        l1.listar();
        l1.RetListaFone("Gustavo");
        l1.listar();
    }
}