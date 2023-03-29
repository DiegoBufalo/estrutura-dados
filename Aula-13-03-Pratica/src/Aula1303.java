import java.util.List;
import java.util.Optional;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Aula1303 {

    public static void main(String[] args) {
        Conta conta1 = new Conta(50, "123", "1001");
        Conta conta2 = new Conta(1000, "321", "1002");

        List<Conta> contas = List.of(conta1, conta2);

        Banco banco = new Banco(contas);

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Qual operacao desejada? \r\n 1-Nova Operacao \r\n 2-Sair");
            int operacao = input.nextInt();
            if (operacao == 2) {
                input.close();
                System.exit(0);
            }

            // Digitar conta a qual deve ser realizada a operação
            System.out.println("Digite a conta que deseja realizar uma operacao:");
            String conta = input.next();
            Optional<Conta> contaEncontrada = banco.getConta(conta);
            // Verifica se a conta existe
            if (contaEncontrada.isEmpty()) {
                System.out.println("\r\nConta informada nao foi encontrada:");
                continue;
            }

            // Valida a senha da conta
            System.out.println("Digite a senha da conta:");
            String senha = input.next();
            boolean senhaCorreta = contaEncontrada.get().validarSenha(senha);
            if (!senhaCorreta) {
                System.out.println("Senha informada esta incorreta, operacao abortada");
                continue;
            }

            // Escolha operação
            System.out.println("Qual operacao desejada? \r\n 1-Sacar \r\n 2-Depositar");
            operacao = input.nextInt();

            double valor;
            switch (operacao) {
                case 1:
                    System.out.println("Qual valor deseja sacar?");
                    valor = input.nextDouble();
                    double resto = contaEncontrada.get().sacar(valor);
                    System.out.println("Saque realizado com sucesso, valor restante: R$ " + resto);
                    break;
                case 2:
                    System.out.println("Qual valor deseja depositar?");
                    valor = input.nextDouble();
                    double total = contaEncontrada.get().depositar(valor);
                    System.out.println("Deposito realizado com sucesso, valor atual: R$ " + total);
                    break;
                default:
                    System.out.println("Operacao invalida");
            }
        }
    }
}