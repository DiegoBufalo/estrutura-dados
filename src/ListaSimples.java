class ListaSimples {

	public static class Nodo {
		public Object data;
		public Nodo link;
	}

	public static void mostra(Nodo lista) {
		Nodo aux = new Nodo();
		aux = lista;
		System.out.println("Lista: \n");
		while (aux != null) {
			System.out.print(aux.data + " ");
			aux = aux.link;
		}
		System.out.println("\n");
	}

	public static void mostraRec(Nodo lista) {
		if (lista.link != null) {
			System.out.print(lista.data + " ");
			mostraRec(lista.link);
		}
	}

	public static void mostraRecInv(Nodo lista) {
		if (lista.link != null) {
			mostraRecInv(lista.link);
			System.out.print(lista.data + " ");
		}
	}

	public static Nodo incluiIni(Nodo lista, char elem) {
		Nodo inclui = new Nodo();
		inclui.data = elem;
		inclui.link = lista;
		lista = inclui;
		return lista;
	}

	public static void main(String args[]) {
		// Formando a lista encadeada [A,B,C,D,E,F,G]
		Nodo lista1 = new Nodo();
		lista1.data = 'A';
		Nodo aux1 = new Nodo();
		aux1.data = 'B';
		lista1.link = aux1;
		Nodo aux2 = new Nodo();
		aux2.data = 'C';
		aux1.link = aux2;
		aux1 = new Nodo();
		aux1.data = 'D';
		aux2.link = aux1;
		aux2 = new Nodo();
		aux2.data = 'E';
		aux1.link = aux2;
		aux1 = new Nodo();
		aux1.data = 'F';
		aux2.link = aux1;
		aux2 = new Nodo();
		aux2.data = 'G';
		aux1.link = aux2;

		mostra(lista1);
		lista1 = incluiIni(lista1, 'H');
		mostra(lista1);

		System.out.println("Mostra Recursiva:\n");
		mostraRec(lista1);

		System.out.println("\n");
		System.out.println("Mostra Recursiva Invertida:\n");
		mostraRecInv(lista1);
	}
}
