public class Aula06 {
    public static String inverterPalavra(String frase) {
        String[] palavras = frase.split(" ");
        String invertida = "";
    
        for (int i = 0; i < palavras.length; i++) {
          char[] palavra = palavras[i].toCharArray();
    
          for (int j = palavra.length - 1; j >= 0; j--) {
            invertida += palavra[j];
          }
    
          invertida += " ";
        }
    
        return invertida;
      }
    
      public static boolean palindroma(String palavra) {
        palavra = palavra.replace(" ", "").toLowerCase();
        char[] vetor = palavra.toCharArray();
    
        int baixo = 0;
        int topo = vetor.length - 1;
        boolean isPalindromo = true;
    
        for (int i = 0; i < topo / 2; i++) {
          if (vetor[baixo] == (vetor[topo])) {
            baixo++;
            topo--;
          } else {
            isPalindromo = false;
            break;
          }
        }
    
        return isPalindromo;
      }
}
