package listaRevisao;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ListaExercicios {
    public static void main(String[] args) throws Exception {
        Map<Integer, MetodoRunnable> mapaExercicio = new HashMap<>();
        mapaExercicio.put(0, new MetodoRunnable("sair", ListaExercicios::sair));
        mapaExercicio.put(1, new MetodoRunnable("exercicio 1", ListaExercicios::exercicio1));
        mapaExercicio.put(2, new MetodoRunnable("exercicio 2", ListaExercicios::exercicio2));
        mapaExercicio.put(3, new MetodoRunnable("exercicio 3", ListaExercicios::exercicio3));
        mapaExercicio.put(4, new MetodoRunnable("exercicio 4", ListaExercicios::exercicio4));
        mapaExercicio.put(5, new MetodoRunnable("exercicio 5", ListaExercicios::exercicio5));
        mapaExercicio.put(6, new MetodoRunnable("exercicio 6", ListaExercicios::exercicio6));
        mapaExercicio.put(7, new MetodoRunnable("exercicio 7", ListaExercicios::exercicio7));
        mapaExercicio.put(8, new MetodoRunnable("exercicio 8", ListaExercicios::exercicio8));
        mapaExercicio.put(9, new MetodoRunnable("exercicio 9", ListaExercicios::exercicio9));
        mapaExercicio.put(10, new MetodoRunnable("exercicio 10", ListaExercicios::exercicio10));
        mapaExercicio.put(11, new MetodoRunnable("exercicio 11", ListaExercicios::exercicio11));
        mapaExercicio.put(12, new MetodoRunnable("exercicio 12", ListaExercicios::exercicio12));
        mapaExercicio.put(13, new MetodoRunnable("exercicio 13", ListaExercicios::exercicio13));
        mapaExercicio.put(14, new MetodoRunnable("exercicio 14", ListaExercicios::exercicio14));
        mapaExercicio.put(15, new MetodoRunnable("exercicio 15", ListaExercicios::exercicio15));
        mapaExercicio.put(16, new MetodoRunnable("exercicio 16", ListaExercicios::exercicio16));
        mapaExercicio.put(17, new MetodoRunnable("exercicio 17", ListaExercicios::exercicio17));
        mapaExercicio.put(18, new MetodoRunnable("exercicio 18", ListaExercicios::exercicio18));
        mapaExercicio.put(19, new MetodoRunnable("exercicio 19", ListaExercicios::exercicio19));
        mapaExercicio.put(20, new MetodoRunnable("exercicio 20", ListaExercicios::exercicio20));
        mapaExercicio.put(21, new MetodoRunnable("exercicio 21", ListaExercicios::exercicio21));
        mapaExercicio.put(22, new MetodoRunnable("exercicio 22", ListaExercicios::exercicio22));
        mapaExercicio.put(23, new MetodoRunnable("exercicio 23", ListaExercicios::exercicio23));
        mapaExercicio.put(24, new MetodoRunnable("exercicio 24", ListaExercicios::exercicio24));
        mapaExercicio.put(25, new MetodoRunnable("exercicio 25", ListaExercicios::exercicio25));
        mapaExercicio.put(26, new MetodoRunnable("exercicio 26", ListaExercicios::exercicio26));
        mapaExercicio.put(27, new MetodoRunnable("exercicio 27", ListaExercicios::exercicio27));
        mapaExercicio.put(28, new MetodoRunnable("exercicio 28", ListaExercicios::exercicio28));
        mapaExercicio.put(29, new MetodoRunnable("exercicio 29", ListaExercicios::exercicio29));
        mapaExercicio.put(30, new MetodoRunnable("exercicio 30", ListaExercicios::exercicio30));
        mapaExercicio.put(31, new MetodoRunnable("exercicio 31", ListaExercicios::exercicio31));
        mapaExercicio.put(32, new MetodoRunnable("exercicio 32", ListaExercicios::exercicio32));
        mapaExercicio.put(33, new MetodoRunnable("exercicio 33", ListaExercicios::exercicio33));
        mapaExercicio.put(34, new MetodoRunnable("exercicio 34", ListaExercicios::exercicio34));

         do {
            try {
                String logExecucao = "";
                for (int i = 1; i < mapaExercicio.size(); i++) {
                    logExecucao += mapaExercicio.get(i).getMethodName() + "\n";
                }

                logExecucao += "\n" + "Digite o numero do exercicio para testar ou 0 para sair";

                int opcao = Integer.parseInt(JOptionPane.showInputDialog(logExecucao));
                MetodoRunnable metodo =  mapaExercicio.get(opcao);
                metodo.getRunnable().run();
                if (!metodo.getMethodName().endsWith(" - Executado")) {
                    metodo.setMethodName(metodo.getMethodName().concat(" - Executado"));
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ta usando errado!!");
            }
        } while(true);
    }

    private static void sair() {
        JOptionPane.showMessageDialog(null, "Sayonara");
        System.exit(0);
    }

    // 01) Faça um programa que receba um valor que é o valor pago, um segundo valor
    // que é o preço
    // do produto e retorne o troco a ser dado.
    private static void exercicio1() {
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preco do produto"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite valor entregue pelo cliente"));

         JOptionPane.showMessageDialog(null, "Troco: " + (valor - preco));
    }

    // 02) Faça um programa que receba o valor do quilo de um produto e a quantidade
    // de quilos do
    // produto consumida calculando o valor final a ser pago.
    private static void exercicio2() {
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite peso do produto"));
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preco do produto"));

        JOptionPane.showMessageDialog(null, "Valor: " + peso * preco);
    }

    // 03) Faça um programa que receba 2 valores e retorne o maior entre eles.
    private static void exercicio3() {
        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor"));
        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor"));

        double maior = valor1 > valor2 ? valor1 : valor2;

        JOptionPane.showMessageDialog(null, "Maior valor: " + maior);
    }

    // 04) Faça um programa que receba 4 valores e retorne o menor entre eles.
    private static void exercicio4() {
        double[] valores = new double[4];
        for (int i = 0; i < 3; i++) {
            String mensagem = String.format("Digite o %d valor", i + 1);
            try {
                valores[i] = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido!");
                i--;
            }
        }

        double menor = valores[0];

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] < menor) {
                menor = valores[i];
            }
        }

        JOptionPane.showMessageDialog(null, "Menor valor: " + menor);
    }

    // 05) Faça um programa que verifique se um número é impar.
    private static void exercicio5() {
        double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor para saber se é impar"));
        JOptionPane.showMessageDialog(null, (numero % 2 != 0) ? "Verdadeiro" : "Falso");
    }

    // 06) Faça um programa que receba 3 valores que representarão os lados de um
    // triângulo e
    // verifique se os valores formam um triângulo e classifique esse triângulo
    // como:
    // - eqüilátero (3 lados iguais);
    // - isósceles (2 lados iguais);
    // - escaleno (3 lados diferentes).
    // Lembre-se que para formar um triângulo:
    // - nenhum dos lados pode ser igual a zero;
    // - um lado não pode ser maior do que a soma dos outros dois;
    private static void exercicio6() {
        Double vertice1, vertice2, vertice3;

        double[] vertices = new double[3];
        for (int i = 0; i < 3; i++) {
            String mensagem = String.format("Digite o valor do  %d vertice do triângulo", i + 1);
            try {
                vertices[i] = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido!");
                i--;
            }
        }

        vertice1 = vertices[0];
        vertice2 = vertices[1];
        vertice3 = vertices[2];

        String resultado = "";

        if (vertice1 == 0 || vertice2 == 0 || vertice3 == 0) {
            resultado = "Nao é um triangulo";

        } else if ((vertice1 + vertice2 < vertice3)
                || (vertice1 + vertice3 < vertice2)
                || (vertice2 + vertice3 < vertice1)) {
            resultado =  "Nao é um triangulo";

        } else if (vertice1 == vertice2 && vertice2 == vertice3) {
            resultado =  "Equilátero";

        } else if (vertice1 == vertice2 || vertice2 == vertice3 || vertice1 == vertice3) {
            resultado =  "Isósceles";

        } else {
            resultado =  "Escaleno";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    // 07) Utilize a estrutura if para fazer um programa que retorne o nome de um
    // produto a partir do
    // código do mesmo. Considere os seguintes códigos:
    // 1 – Parafuso;
    // 2 – Porca;
    // 3 – Prego;
    // Para qualquer outro código indicar “Diversos”.
    private static void exercicio7() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));

        String resultado = "";
        if (codigo == 1) {
            resultado = "Parafuso";
        } else if (codigo == 2) {
           resultado = "Porca";
        } else if (codigo == 3) {
          resultado = "Prego";
        } else {
             resultado = "Diversos";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    // 08) Refaça o exercício anterior usando a estrutura switch.
    private static void exercicio8() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do produto"));

        String resultado = "";
        switch (codigo) {
            case 1:
                resultado = "Parafuso";
            case 2:
                resultado = "Porca";
            case 3:
                resultado = "Prego";
            default:
                resultado = "Diversos";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    // 09) Faça um programa que utilize a estrutura while para ler 50 números e
    // calcule e exiba a média
    // aritmética deles.
    private static void exercicio9() {
        int[] numeros = inputArray(50);
        double soma = 0;
        int i = 0;
        while (i < numeros.length) {
            soma += numeros[i];
            i++;
        }

        JOptionPane.showMessageDialog(null, soma / numeros.length);
    }

    // 10) Refaça o programa anterior utilizando a estrutura do while.
    private static void exercicio10() {
        int[] numeros = inputArray(50);

        double soma = 0;
        int i = 0;

        do {
            soma += numeros[i];
            i++;
        } while (i < numeros.length);

         JOptionPane.showMessageDialog(null, soma / numeros.length);
    }

    // 11) Refaça novamente o exercício usando a estrutura for.
    private static void exercicio11() {
        int[] numeros = inputArray(50);

        double soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        JOptionPane.showMessageDialog(null, soma / numeros.length);
    }

    // 12) Faça um programa que receba 10 valores inteiros e os coloque em um vetor.
    // Em seguida
    // exiba-os em ordem inversa à ordem de entrada.
    private static void exercicio12() {
        int[] numeros = inputArray(10);
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
    }

    // 13) Faça um programa que utilize uma estrutura de repetição para ler 50
    // números armazenando-os
    // em um vetor e calcule e exiba a média aritmética deles. Em seguida o programa
    // deve apresentar
    // todos os valores armazenados no vetor que sejam menores que a média.
    private static void exercicio13() {
        int[] numeros = inputArray(50);

        double soma = 0;
        double media = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        media = soma / numeros.length;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < media) {
                System.out.println(numeros[i]);
            }
        }
    }

    // 14) O vetor b deve se tornar uma cópia do vetor a.
    // Resposta: 32 45 89 66 12 35 10 96 38 15 13 11 65 81 35 64 16 89 54 19
    private static void exercicio14() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        m = b.length;
        printResultado(m, b);
    }

    // 15) O vetor b deve se tornar uma cópia revertida do vetor a (a ordem dos
    // elementos deve ser trocada).
    // Resposta: 19 54 89 16 64 35 81 65 11 13 15 38 96 10 35 12 66 89 45 32
    private static void exercicio15() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];

        int i2 = 0;
        for (int i = n-1; i >= 0; i--) {
            b[i2] = a[i];
            i2++;
        }

        int m = b.length;

        printResultado(m, b);
    }

    // 16) b[0] deve receber o valor do maior elemento (conteúdo) de a.
    // Resposta: 96
    private static void exercicio16() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;
        
        int maior = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > maior) {
                maior = a[i];
            }
        }

        int b[] = {maior};
        int m = b.length;

        printResultado(m, b);
    }

    // 17) b[0] deve receber o índice (posição) do menor elemento (conteúdo) de a.
    // Em caso de empate,
    // o índice indicado deve ser o menor.
    // Resposta: 6
    // (Note que a[6] = 10 é o menor elemento (conteúdo) presente no vetor a.)
    private static void exercicio17() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int menorElemento = a[0];
        int indice = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] < menorElemento) {
                menorElemento = a[i];
                indice = i;
            }
        }

        int b[] = {indice};
        int m = b.length;

        printResultado(m, b);
    }

    // 18) b deve receber a lista dos números que estão nos índices (posições) pares
    // de a.
    // Resposta: 32 89 12 10 38 13 65 35 16 54
    private static void exercicio18() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n/2];

        int indice = 0;
        for (int i = 0; i < n; i += 2) {
            b[indice] = a[i];
            indice++;
        }

        int m = b.length;

        printResultado(m, b);
    }

    // 19) b deve receber a lista dos números pares de a.
    // Resposta: 32 66 12 10 96 38 64 16 54
    private static void exercicio19() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int indice = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[indice] = a[i];
                indice++;
            }
        }

        int m = indice;

        printResultado(m, b);
    }

    // 20) b deve receber a lista dos índices (posições) de a que contém elementos
    // maiores do que 50.
    // Resposta: 2 3 7 12 13 15 17 18
    private static void exercicio20() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;
         for (int i = 0; i < n; i++) {
            if (a[i] > 50) {
                b[m] = i;
                m++;
            }
        }

        printResultado(m, b);
    }

    // 21) b[0] deve receber a média aritmética dos elementos de a (arredondada para
    // baixo).
    // Resposta: 44
    private static void exercicio21() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
     
        int soma = 0;
        for (int i = 0; i < n; i++) {
            soma += a[i];
        }

        b[0] = soma / n;

        int m = 1;

        printResultado(m, b);
    }

    // 22) b[0] deve receber o total dos elementos ímpares de a.
    // Resposta: 497
    private static void exercicio22() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;
        
        int somaImpares = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) somaImpares += a[i];
        }

        int b[] = {somaImpares};
        int m = 1;

        printResultado(m, b);
    }

    // 23) b[0] deve receber o maior elemento de A que seja inferior a 50 (se não
    // houver números
    // inferiores a 50, a resposta deve ser 0). Considere que nunca haverá elementos
    // negativos em a.
    // Resposta: 45
    private static void exercicio23() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int maiorElemento = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] < 50 && a[i] > maiorElemento) {
                maiorElemento = a[i];
            }
        }

        int b[] = {maiorElemento};
        int m = 1;

        printResultado(m, b);
    }

    // 24) b[0] deve receber o índice do primeiro elemento ímpar de a
    // Resposta: 1
    private static void exercicio24() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[1];
        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                b[0] = i;
                break;
            }
        }
        
        int m = b.length;

        printResultado(m, b);
    }

    // 25) b[0] deve receber o índice do último elemento par de a (se não houver
    // números pares em a, a
    // resposta deve ser -1).
    // Resposta: 18
    private static void exercicio25() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = {-1};

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                b[0] = i;
            }
        }

        int m = b.length;

        printResultado(m, b);
    }

    // 26) b deve receber a lista decrescente dos índices de a que contenham
    // elementos menores que
    // 50.
    // Resposta: 19 16 14 11 10 9 8 6 5 4 1 0
    private static void exercicio26() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = n-1; i >= 0; i--) {
            if (a[i] < 50) {
                b[m] = i;
                m++;
            }
        }

        printResultado(m, b);
    }

    // 27) b deve receber a lista dos índices de a em que aparecem elementos menores
    // do que os que
    // estão no índice seguinte. O último índice do vetor não deve ser considerado.
    // Resposta: 0 1 4 6 11 12 14 16
    private static void exercicio27() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = 0; i < n -1; i++) {
            if (a[i] < a[i+1]) {
                b[m] = i;
                m++;
            }
        }

        printResultado(m, b);
    }

    // 28) b deve receber a lista dos índices de a em que aparecem elementos que são
    // a média aritmética dos seus vizinhos à esquerda e à direita. O primeiro e o último
    // índice não devem ser considerados.
    // Resposta: 10 18
    private static void exercicio28() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = 1; i < n -1; i++) {
            int media = (a[i - 1] + a[i + 1]) / 2 ;

            if (a[i] == media) {
                b[m] = i;
                m++;
            }
        }

        printResultado(m, b);
    }

    // 29) b deve receber a lista dos índices de a que contém o mesmo elemento que
    // está no índice
    // "simétrico": O primeiro elemento deve ser comparado com o último, o segundo
    // com o penúltimo e
    // assim por diante. Um par de números só deve ser comparado uma vez, ou seja,
    // se a[3] = a[16]
    // apenas o 3 deve aparecer na lista.
    // Resposta: 2 5
    private static void exercicio29() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        int y = a.length - 1;
        for (int i = 0; i < n /2; i++) {
            if (a[i] == a[y]) {
                b[m] = i;
                m++;
            }

            y--;
        }

        printResultado(m, b);
    }

    // 30) b deve receber a “ filtrado”. O primeiro e o último índice se mantém
    // iguais, mas os índices
    // internos devem ser modificados da seguinte maneira: cada índice de b conterá
    // a média aritmética
    // do número na posição correspondente em b e dos números vizinhos.
    // Resposta: 32 55 66 55 37 19 47 48 49 22 13 29 52 60 60 38 56 53 54 19
    private static void exercicio30() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;
    
        int b[] = new int[n];
        b[0] = a[0];
        b[n - 1] = a[n - 1];
    
        for (int i = 1; i < n - 1; i++) {
            b[i] = (a[i - 1] + a[i] + a[i + 1]) / 3;
        }
    
        printResultado(n, b);
    }

    // 31) b[0] deve receber o maior elemento de a, enquanto que b[1] deve receber o
    // segundo maior
    // elemento de a. Você pode supor que a tem pelo menos dois elementos.
    // Resposta: 96 89
    private static void exercicio31() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;
    
        int b[] = new int[2];
        int m = 2;
    
        int maior1 = 0; 
        int maior2 = 0;
    
        for (int i = 0; i < n; i++) {
            if (a[i] > maior1) {
                maior2 = maior1;
                maior1 = a[i];
            } else if (a[i] > maior2) {
                maior2 = a[i];
            }
        }
    
        b[0] = maior1;
        b[1] = maior2;
    
        printResultado(m, b); // Print the result
    }

    // 32) b deve receber a lista dos elementos de a que são primos.
    // Resposta: 89 13 11 89 19
    private static void exercicio32() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = 0; i < n ; i++) {
            if (isPrimo(a[i])) {
                b[m] = a[i];
                m++;
            }
        }

        printResultado(m, b);
    }

    // 33) b deve receber a ordenado de forma crescente ou “ ordem não-decrescente”,
    // já que poderá haver números repetidos. Este é um problema de solução mais complicada, para
    // a qual haverá soluções clássicas, que veremos nesta disciplina. Veja o que consegue sozinho!
    // Resposta: 10 11 12 13 15 16 19 32 35 35 38 45 54 64 65 66 81 89 89 96
    private static void exercicio33() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            b[i] = a[i];
        }

        int m = b.length;

        printResultado(m, b);
    }

    // 34) b deve receber os elementos de a, removendo-se os que aparecem apenas uma
    // vez. Os que
    // aparecem mais de uma vez devem aparecer tantas vezes quantas apareciam em a.
    // Resposta: 89 35 35 89
    private static void exercicio34() {
        int a[] = { 32, 45, 89, 66, 12, 35, 10, 96, 38, 15, 13, 11, 65, 81, 35, 64, 16, 89, 54, 19 };
        int n = a.length;

        int b[] = new int[n];
        int m = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n -1; j++) {
                if (j == i) continue;
                else if (a[i] == a[j]) {
                    b[m] = a[i];
                    m++;
                    break;
                }
            } 
        }

        printResultado(m, b);
    }

    private static void printResultado(int m, int[] b) {
        String saida = "Resposta:\n";
        for (int i = 0; i < m; i++)
            saida = saida + b[i] + " ";
        saida = saida + "\nFim.";
        JOptionPane.showMessageDialog(null,saida);
    }

    private static boolean isPrimo(int n) {
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    private static int[] inputArray(int quantidade) {
        int[] numeros = new int[quantidade];
        for (int i = 0; i < numeros.length; i++) {
            String mensagem = String.format("Digite o valor da posicao %d do array", i);
            try {
                numeros[i] = (int) Integer.parseInt(JOptionPane.showInputDialog(mensagem));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valor invalido!");
                i--;
            }
        }

        return numeros;
    }
}
