package fatorial;

import java.util.*;

public class Fatorial {
    public static int fatore(int n){
        if(n == 1) {
            return 1;
        }
        return n * fatore(n - 1);
    }

}
