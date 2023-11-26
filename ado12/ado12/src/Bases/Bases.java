package Bases;
import java.util.*;

public class Bases {

    public static int maximoDivisor(int a, int b){
        if(b == 0){
            return a;
        }
        return maximoDivisor(b, a % b);
    }
    public static int potencia(int a, int b){
        if (b == 0 ){
            return 1;
        }else {
            return a * potencia(a, b - 1);
        }
    }
    public static double contMulti(double a, double b) {
        if (a == 0 || b == 0){
            return 0;
        }else{
            return  b + contMulti(a - 1, b);
        }
    }
}