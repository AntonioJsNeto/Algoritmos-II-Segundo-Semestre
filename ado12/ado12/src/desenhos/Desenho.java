package desenhos;
public class Desenho {

    public void quadrado(int lado){
        System.out.println(quadradoCalculo(lado, lado));
    }

    private int quadradoCalculo(int lado, int lados){
        if(lados == 1){
            return (lado);
        }else{
            return lado + quadradoCalculo(lado ,lados - 1);
        }
    }


    public void retangulo(int base, int altura){

        System.out.println(retanguloCalculo(base, altura));

    }

    private int retanguloCalculo(int base, int altura){
        if (altura == 1){
            return base;
        }else {
            return base + retanguloCalculo(base,altura - 1);
        }

    }


    public void triangulo(int altura){
        System.out.println(trianguloCalculo(altura,altura)/2);
    }
    private double trianguloCalculo(double altura, double base){
        if(base == 1){
            return altura;
        }else{
            return altura + trianguloCalculo(altura,base - 1);
        }
    }


}
