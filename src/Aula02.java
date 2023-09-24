import javax.swing.JOptionPane;

public class Aula02 {
  private static final String tela = 
    """
      escolha o numero da ação:
        1 - fatorial
        2 - fibonacci
        3 - potencia
        4 - hanoi
        --------------------
        0 - para interromper
    """;

  public static void main(String[] args) throws Exception {    
    try {
      while (true) {
        Integer escolha = Integer.parseInt(JOptionPane.showInputDialog(tela));

        switch (escolha) {
          case 1: 
            //  fatorial
            Integer fatorial = Integer.parseInt(JOptionPane.showInputDialog("digite o fatorial para calcular"));
            JOptionPane.showMessageDialog(null, fatorial(fatorial));
          break;
          case 2: 
            // fibonacci
            Integer fibonacci = Integer.parseInt(JOptionPane.showInputDialog("digite a posição fibonacci que deseja saber o valor"));
            JOptionPane.showMessageDialog(null, fibonacci(fibonacci));
          break;
          case 3: 
            // potencia
            Integer base = Integer.parseInt(JOptionPane.showInputDialog("digite o valor da base da potencia"));
            Integer expoente = Integer.parseInt(JOptionPane.showInputDialog("digite o expoente"));
            JOptionPane.showMessageDialog(null, pot(base, expoente));
          break;
          case 4: 
            // hanoi
            Integer qtdDiscos = Integer.parseInt(JOptionPane.showInputDialog("digite a quantidade de discos"));
            hanoi(qtdDiscos, 'A', 'B', 'C');
          break;
          case 0:
            JOptionPane.showMessageDialog(null, "Adeus");
            System.exit(0);
          break;
          default: 
            JOptionPane.showMessageDialog(null, "Valor inválido");
          break;
        }
      }
    } catch (Exception e) {
      System.exit(0);
    }
  }
  
  // n! = n. (n-1)
  private static int fatorial(int f) {
    if (f <= 1) return 1;
    else return f * fatorial(f - 1);
  }

  // Fn = fn-1 + Fn-2
  private static int fibonacci(int f) {
    if (f <= 2) return 1;
    return fibonacci(f - 1) + fibonacci(f - 2);
  }

  // Be = B * Be-1
  private static int pot(int b, int e) {
    if (e <= 0) return 1;
    return b * pot(b, e - 1);
  }

  private static void hanoi(int discos, char a, char b, char c) {
    if (discos > 0) {
      hanoi(discos - 1, a, c, b);
      mover(discos, b, c);
      hanoi(discos - 1, b, a, c);
    }
  }

  private static void mover(int disco, char origem, char destino) {
    String movimento = String.format("Mova o disco %d de %s para %s", disco, origem, destino);
    System.out.println(movimento);
  }
}
