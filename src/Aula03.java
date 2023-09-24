import javax.swing.JOptionPane;

public class Aula03 {
  public static void main(String[] args) throws Exception {
    int[] iVetor = new int[] { 1, 2, 5, 4, 6, 11, 20, 14, 0, 8 };
    int[] iVetorOrd = new int[] { 0, 1, 2, 4, 5, 6, 8, 11, 14, 20 };
    int[] iVetorOrdDec = new int[] { 20, 14, 11, 8, 6, 5, 4, 2, 1, 0 };
    // int[] iVetorRepeticao = new int[] { 1, 1, 1, 2, 3, 3, 4, 4, 4, 4, 4, 5 };

    //int iKey = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave que deseja buscar"));

    //int quantidade = buscaIterativaSequencialContagemIgual(iVetorRepeticao, iKey);
    //JOptionPane.showMessageDialog(null, String.format("Foram encontradas %d vezes no código", quantidade));

    try {
      while (true) {
        int escolha = Integer
            .parseInt(JOptionPane.showInputDialog("Digite o numero da questão 1, 2, 3, 4 ou 0 para sair"));
        int iKey = 0;
        if (escolha != 0)
          iKey = Integer.parseInt(JOptionPane.showInputDialog("Digite a chave que deseja buscar"));

        boolean encontrado = false;
        switch (escolha) {
          case 1:
            encontrado = buscaIterativaSequencial(iVetor, iKey);
            buscaIterativaBinaria(iVetorOrd, iKey);
            break;
          case 2:
            encontrado = buscaIterativaSequencialDecrescente(iVetor, iKey);
            break;
          case 3:
            encontrado = buscaIterativaBinariaDecrescente(iVetorOrdDec, iKey);
            break;
          case 4:
            encontrado = buscaIterativaSequencialOrdenada(iVetorOrd, iKey);
            break;
          case 0:
            JOptionPane.showMessageDialog(null, "Adeus");
            System.exit(0);
            break;
          default:
            JOptionPane.showMessageDialog(null, "Ta perdido doidão?");
            break;
        }

        if (encontrado) {
          JOptionPane.showMessageDialog(null,
              String.format("O valor %d se encontra na coleção", iKey));
        } else {
          JOptionPane.showMessageDialog(null,
              String.format("O valor %d não se encontra na coleção", iKey));
        }
      }
    } catch (Exception e) {
      System.exit(0);
    }
  }

  private static boolean buscaIterativaSequencial(int[] iVetor, int iKey) {
    for (int i = 0; i < iVetor.length; i++) {
      if (iVetor[i] == iKey) {
        return true;
      }
    }
    return false;
  }

  private static boolean buscaIterativaBinaria(int[] iVetor, int iKey) {
    int iMenor = 0;
    int iMaior = iVetor.length-1;
    int iMeio;

    while (iMenor <= iMaior) {
      iMeio = (iMenor + iMaior) / 2;
      if (iKey < iVetor[iMeio])
        iMaior = iMeio - 1;
      else if (iKey > iVetor[iMeio])
        iMenor = iMeio + 1;
      else {
        return true;
      }
    }
    return false;
  }

  private static boolean buscaIterativaSequencialDecrescente(int[] iVetor, int iKey) {
    for (int i = iVetor.length - 1; i >= 0; i--) {
      if (iVetor[i] == iKey) {
        return true;
      }
    }
    return false;
  }

  private static boolean buscaIterativaBinariaDecrescente(int[] iVetor, int iKey) {
    int iMenor = 0;
    int iMaior = iVetor.length;
    int iMeio;

    while (iMenor <= iMaior) {
      iMeio = (iMenor + iMaior) / 2;
      if (iKey > iVetor[iMeio])
        iMaior = iMeio - 1;
      else if (iKey < iVetor[iMeio])
        iMenor = iMeio + 1;
      else
        return true;
    }
    return false;
  }

  private static boolean buscaIterativaSequencialOrdenada(int[] iVetor, int iKey) {
    for (int i = 0; i < iVetor.length; i++) {
      if (iVetor[i] == iKey) {
        return true;
      } else if (iVetor[i] > iKey)
        break;
    }
    return false;
  }

  // private static int buscaIterativaSequencialContagemIgual(int[] iVetor, int iKey) {
  //   int qtdEncontrada = 0;
  //   for (int i = 0; i < iVetor.length; i++) {
  //     if (iVetor[i] == iKey)
  //       qtdEncontrada += 1;
  //   }
  //   return qtdEncontrada;
  // }

  // private static boolean buscaIterativaBinariaContagem(int[] iVetor, int iKey) {
  //   int iMenor = 0;
  //   int iMaior = iVetor.length;
  //   int iMeio;

  //   int quantidade = 0;
  //   while (iMenor <= iMaior) {
  //     iMeio = (iMenor + iMaior) / 2;
  //     if (iKey < iVetor[iMeio])
  //       iMaior = iMeio - 1;
  //     else if (iKey > iVetor[iMeio])
  //       iMenor = iMeio + 1;
  //     else {
  //       return true;
  //     }
  //   }
  //   return false;
  // }
}