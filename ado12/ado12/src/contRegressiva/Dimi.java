package contRegressiva;

import java.util.Scanner;

public class Dimi {

    public static int contDemi(int n){
        if(n == 1) {
            return 1;
        }
        System.out.println(n);
        return contDemi(n - 1);
    }
}