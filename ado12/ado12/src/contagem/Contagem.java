package contagem;
import java.util.*;

public class Contagem {
    public static int contCresc(int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        }

        System.out.println(inicio);
        return 1 + contCresc(inicio + 1, fim);
    }

    public static int contPares(int inicio, int fim) {
        if (inicio > fim) {
            return 0;
        }

        if (inicio % 2 == 0) {
            System.out.println(inicio);
            return 1 + contPares(inicio + 1, fim);
        } else {
            return contPares(inicio + 1, fim);
        }
    }
}
