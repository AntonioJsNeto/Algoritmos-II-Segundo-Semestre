package Operacoes;

import java.util.Scanner;

public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        Operacoes operacoes = new Operacoes();
        executarMenu(operacoes, ler);
    }

    private static void executarMenu(Operacoes operacoes, Scanner ler) {
        System.out.println("Escolha uma operação:");
        System.out.println("1. Verificar se é primo");
        System.out.println("2. Binário");
        System.out.println("3. Tabuada");
        System.out.println("4. Média");
        System.out.println("0. Sair");

        int opcao = ler.nextInt();
        if (opcao == 0) {
            System.out.println("PROGRAMA FINALIZADO!!");
        } else {
            processarOpcao(operacoes, ler, opcao);
            executarMenu(operacoes, ler);
        }
    }

    private static void processarOpcao(Operacoes operacoes, Scanner ler, int opcao) {
        switch (opcao) {
            case 1:
                System.out.println("Informe o número:");
                int numero = ler.nextInt();
                System.out.println("Informe o divisor:");
                int divisor = ler.nextInt();
                System.out.println("Primos: " + operacoes.primo(numero, divisor));
                break;
            case 2:
                System.out.println("Informe o número:");
                int numero1 = ler.nextInt();
                operacoes.binario(numero1);
                break;
            case 3:
                System.out.println("Informe o número:");
                int numeroTabuada = ler.nextInt();
                operacoes.tabuada(numeroTabuada);
                break;
            case 4:
                System.out.println("Informe o número de notas:");
                int quantidadeNotas = ler.nextInt();

                if (quantidadeNotas <= 0) {
                    System.out.println("Número inválido de notas.");
                    break;
                }

                double[] notas = new double[quantidadeNotas];
                lerNotas(notas, 0);

                double media = operacoes.media(notas);
                System.out.println("Média: " + media);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
        }
    }

    private static void lerNotas(double[] notas, int indice) {
        if (indice < notas.length) {
            System.out.println("Informe a nota " + (indice + 1) + ":");
            notas[indice] = ler.nextDouble();
            lerNotas(notas, indice + 1);
        }
    }
}