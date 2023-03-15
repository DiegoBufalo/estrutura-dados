import java.util.Scanner;

/**
 * Lista de exercicios de revisão Estrutura de dados Prática
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.println("\033[H\033[2J");
                String menu = """
                            Bem-vindo(a), logo abaixo você vera uma lista com diversas funcionalidades,
                            digite a letra que precede a funcionalidade desejada para inicia-la

                            A - Multiplicacao tres numeros reais
                            B - Calculo de notas P1, P2 e P3
                            C - Aumento salarial de 25%
                            D - Media de notas com resultado de aprovacao
                            E - Calculo peso ideial na relacao de sexo e altura
                            F - Soma de valores N valores > 0 com a media entre eles
                            G - Calculo maior numero
                            H - Tabuada do 1 ao 10 de um numero natural
                            I - Media temperatura anual
                            J - Fatorial de numero natural
                            K - Inversao de vetor
                            L - Calculo de vetor com retorno dos maiores que a media
                            M - Calculo de media de menor e maior do vetor e quantidade maior que a media


                            Digite 'SAIR' para encerrar.
                        """;

                System.out.println(menu);
                String operacao = sc.next();

                switch (operacao.toLowerCase()) {
                    case "a":
                        funcA(sc);
                        break;
                    case "b":
                        funcB(sc);
                        break;
                    case "c":
                        funcC(sc);
                        break;
                    case "d":
                        funcD(sc);
                        break;
                    case "e":
                        funcE(sc);
                        break;
                    case "f":
                        funcF(sc);
                        break;
                    case "g":
                        funcG(sc);
                        break;
                    case "h":
                        funcH(sc);
                        break;
                    case "i":
                        funcI(sc);
                        break;
                    case "j":
                        funcJ(sc);
                        break;
                    case "k":
                        funcK(sc);
                        break;
                    case "l":
                        funcL(sc);
                        break;
                    case "m":
                        funcM(sc);
                        break;
                    case "sair":
                        encerrarApp(sc, false);
                        break;
                    default:
                        continue;
                }

                System.out.println("\r\n \r\n Deseja continuar? \r\n 1 - Sim \r\n 2 - Nao");
                int continuar = sc.nextInt();
                if (continuar == 2)
                    encerrarApp(sc, false);
            }

        } catch (Exception e) {
            encerrarApp(sc, true);
        }
    }

    private static void encerrarApp(Scanner sc, boolean forced) {
        sc.close();
        System.out.println("\033[H\033[2J");
        if (forced) {
            System.out.println("*********** VOCE FEZ ALGO ERRADO ***********");
        } else {
            System.out.println("*********** SAYONARA ***********");
        }
        System.exit(0);
    }

    /*
     * a)Faça um programa que recebe três números reais e exibe a multiplicação
     * desses números.
     */
    private static void funcA(Scanner sc) {
        System.out.println("Digite o primeiro numero real");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero real");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro numero real");
        int c = sc.nextInt();

        int mult = a * b * c;
        System.out.println("A multipicacao dos 3 numeros resultou em: " + mult);
    }

    /*
     * b)Faça um programa que recebe as notas P1, P2 e P3 e exibe a média
     * considerando que a nota P1 tem peso 3, a nota P2 tem peso 3 e a nota P3 tem
     * peso 4..
     */
    private static void funcB(Scanner sc) {
        System.out.println("Digite a nota P1");
        Double p1 = sc.nextDouble();
        System.out.println("Digite a nota P2");
        Double p2 = sc.nextDouble();
        System.out.println("Digite a nota P3");
        Double p3 = sc.nextDouble();

        Double media = ((p1 * 3) + (p2 * 3) + (p3 * 4)) / 10;
        System.out.println("Sua nota é: " + media);
    }

    /*
     * c)Faça um programa que lê o salário atual de alguém e exibe o novo salário
     * que é o atual com 25% de aumento.
     */
    private static void funcC(Scanner sc) {
        System.out.println("Digite seu salario atual");
        Double salario = sc.nextDouble();

        Double novoSalario = salario + (salario / 4);
        System.out.println("Seu salario atual com 25% de aumento fica em: " + novoSalario);
    }

    /*
     * d) Faça um programa que recebe duas notas, exibe a média aritmética das notas
     * e uma mensagem indicando se o aluno foi aprovado ou reprovado. A média para
     * aprovação deve ser maior que seis.
     */
    private static void funcD(Scanner sc) {
        System.out.println("Digite sua nota 1");
        Double n1 = sc.nextDouble();
        System.out.println("Digite sua nota 2");
        Double n2 = sc.nextDouble();

        Double nota = ((n1 + n2) / 2);
        String aprovacao = nota >= 6 ? "Aprovado" : "Reprovado";
        System.out.println("Sua media e: " + nota + " e voce esta " + aprovacao);
    }

    /*
     * e) Tendo como entrada a altura e o sexo de uma pessoa, construa um programa
     * que exibe o peso ideal para ela, em quilos. Use as seguintes fórmulas (adote
     * ℎ como a altura e em metros):
     * • Homens: 72,7 × ℎ − 58
     * • Mulheres: 62,1 × ℎ − 44,7
     */
    private static void funcE(Scanner sc) {
        System.out.println("Escolha o sexo:\r\n - M para masculino \r\n - F para feminino");
        String sexo = sc.next();
        System.out.println("Digite sua altura:");
        Double altura = sc.nextDouble();

        Double pesoIdeal;
        switch (sexo.toLowerCase()) {
            case "m":
                pesoIdeal = (72.7 * altura) - 58;
                break;
            case "f":
                pesoIdeal = (62.1 * altura) - 44.7;
                break;
            default:
                System.out.println("Sexo informado nao e válido");
                return;
        }

        System.out.println("Seu peso ideia seria de: " + pesoIdeal + " kg");
    }

    /*
     * f) [while] Elabore um programa que recebe valores naturais até que seja
     * digitado o valor zero. O programa deverá exibir a média aritmética.
     * Lembre-se: o valor zero apenas sinaliza o fim da entrada, não deve ser
     * contabilizado.
     */
    private static void funcF(Scanner sc) {
        int soma = 0;
        int quantidade = 0;
        int valor;

        do {
            System.out.print("Digite um valor natural (ou zero para sair): ");
            valor = sc.nextInt();

            if (valor != 0) {
                soma += valor;
                quantidade++;
            }
        } while (valor != 0);

        if (quantidade > 0) {
            double media = (double) soma / quantidade;
            System.out.println("A media dos valores informados e: " + media);
        } else {
            System.out.println("Nenhum valor foi informado.");
        }
    }

    /*
     * g) Faça um programa que recebe dois números inteiros distintos e exibe o
     * maior.
     */
    private static void funcG(Scanner sc) {
        System.out.println("Digite o primeiro numero:");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero:");
        int b = sc.nextInt();

        int maior = a > b ? a : b;
        System.out.println("O maior e:" + maior);
    }

    /*
     * h) [for] Desenvolva um programa que exibe a tabuada de um número natural
     * escolhido pelo usuário. Os múltiplos apresentados devem ser de 1 a 10.
     */
    private static void funcH(Scanner sc) {
        System.out.println("Digite um numero natural:");
        int num = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }

    /*
     * i) Faça um programa que lê as temperaturas máximas de cada um dos 365 dias do
     * ano e exibe a temperatura média anual.
     */
    private static void funcI(Scanner sc) {
        System.out.println("Ressalva: Digite uma letra para desistir");
        double somaTemperaturas = 0.0;
        int dia;

        for (dia = 1; dia <= 365; dia++) {
            System.out.print("Digite a temperatura maxima do dia " + dia + ": ");
            try {
                double temperatura = sc.nextDouble();
                somaTemperaturas += temperatura;
            } catch (Exception e) {
                sc.nextLine();
                System.out.println("Um ano realmente e muita coisa!");
                dia -= 1;
                break;
            }
        }

        double temperaturaMedia = somaTemperaturas / dia;

        System.out.println("A temperatura media do periodo informado foi de: " + temperaturaMedia + " graus Celsius");
    }

    /*
     * j) [for] Faça um programa que lê um número natural e exibe o fatorial desse
     * número. Lembre-se: 5! é 120, porque 5 × 4 × 3 × 2 × 1 = 120. Use um
     * acumulador e um contador dentro de um laço de repetição.
     */
    private static void funcJ(Scanner sc) {
        System.out.print("Digite um numero natural: ");
        int num = sc.nextInt();

        int fatorial = 1;

        for (int i = num; i >= 1; i--) {
            fatorial *= i;
        }

        System.out.println(num + "! = " + fatorial);
    }

    /*
     * k) Construa um programa que preenche um vetor com dez inteiros e, ao final,
     * exibe o vetor em ordem inversa a de entrada.
     */
    private static void funcK(Scanner sc) {
        int[] vetor = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Vetor em ordem inversa:");

        for (int i = 9; i >= 0; i--) {
            System.out.print(vetor[i] + ", ");
        }
    }

    /*
     * l) Construa um programa que recebe um conjunto de vinte valores reais em um
     * vetor, calcula a média aritmética desses valores e exibe todos os elementos
     * menores do que a média.
     */
    private static void funcL(Scanner sc) {
        double[] valores = new double[20];

        // Preenchimento do vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            valores[i] = sc.nextDouble();
        }

        // Cálculo da média
        double soma = 0;
        for (int i = 0; i < 20; i++) {
            soma += valores[i];
        }
        double media = soma / 20;

        // Exibição dos valores menores que a média
        System.out.println("Valores menores que a média (" + media + "):");
        for (int i = 0; i < 20; i++) {
            if (valores[i] < media) {
                System.out.print(valores[i] + ", ");
            }
        }
    }

    /*
     * m) Construa um programa que exibe a média entre o maior e o menor valor de um
     * vetor de inteiros, com vinte elementos dados pelo usuário, e exiba quantos
     * valores são maiores que a média.
     */
    private static void funcM(Scanner sc) {
        int[] vetor = new int[20];

        // Preenchimento do vetor
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextInt();
        }

        // Cálculo do maior e menor valor
        int maior = vetor[0];
        int menor = vetor[0];
        for (int i = 1; i < 20; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        // Cálculo da média
        double media = (maior + menor) / 2.0;
        System.out.println("A media entre o maior e o menor valor e: " + media);

        // Contagem de valores maiores que a média
        int count = 0;
        for (int i = 0; i < 20; i++) {
            if (vetor[i] > media) {
                count++;
            }
        }
        System.out.println("Existem " + count + " valores maiores que a media.");

    }

}