package fatorial;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[]args){
        Fatorial fatorial = new Fatorial();
        System.out.println("Informe o numero");
        int n = sc.nextInt();

        System.out.println(fatorial.fatore(n));
    }
}
