package contRegressiva;

import contagem.Contagem;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Dimi dimi = new Dimi();
        Scanner ler = new Scanner(System.in);
        System.out.println("informe um numero:");
        int n = ler.nextInt();
        System.out.println(dimi.contDemi(n));
    }
}
