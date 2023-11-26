package Operacoes;

public class Operacoes {

    public static boolean primo(int numero, int divisor) {
        if (numero <= 1) {
            return false;
        }

        if (divisor > Math.sqrt(numero)) {
            return true;
        }

        return (numero % divisor != 0) && primo(numero, divisor + 1);
    }

    public void binario(int numero) {
        if (numero > 0) {
            binario(numero / 2);
            System.out.print((numero % 2));
        }
    }


    public void tabuada(int numero, int multiplicador) {
        if (multiplicador <= 10) {
            System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
            tabuada(numero, multiplicador + 1);
        }
    }

    public void tabuada(int numero) {
        tabuada(numero, 1);
    }

    public static double media(double[] notas) {
        return calcularMedia(notas, 0); // Chama a função auxiliar para iniciar a recursão
    }

    private static double calcularMedia(double[] notas, int indice) {
        if (indice >= notas.length) {
            return 0;
        }

        return notas[indice] / notas.length + calcularMedia(notas, indice + 1);
    }

    public double media(double soma, int quantidade) {
        if (quantidade == 0) {
            return 0;
        }
        double[] mediaArray = new double[]{soma / quantidade};
        return media(mediaArray);

    }}