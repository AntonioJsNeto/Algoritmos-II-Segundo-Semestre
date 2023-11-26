package contagem;

import java.util.Scanner;

public class Main {
        public static void main(String args[]){
            Contagem contagem = new Contagem();
            Scanner ler = new Scanner(System.in);
            System.out.println("Informe o inicio:");
            int inicio = ler.nextInt();
            System.out.println("Informe o final:");
            int fim = ler.nextInt();

            System.out.println("Contagem:");
            int totalNumeros = contagem.contCresc(inicio, fim);
            System.out.println("Total de numeros: " + totalNumeros);

            System.out.println("\nNumeros pares:");
            int totalPares = contagem.contPares(inicio, fim);
            System.out.println("Total de numeros pares: " + totalPares);
        }
}
