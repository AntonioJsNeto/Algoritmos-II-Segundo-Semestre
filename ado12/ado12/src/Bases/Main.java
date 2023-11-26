package Bases;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bases bases = new Bases();
        System.out.println("informe um numero:");
        int a = sc.nextInt();
        System.out.println("Informe outro numero: ");
        int b = sc.nextInt();

        System.out.println("A multiplicacao foi de: " + bases.contMulti(a, b) + "\n");
        System.out.println("A potencia foi de: " + bases.potencia(a, b)+ "\n");
        System.out.println("O maximo divisor foi de: " + bases.maximoDivisor(a, b)+ "\n");
    }
}
