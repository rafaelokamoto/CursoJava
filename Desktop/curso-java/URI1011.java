import java.util.Scanner;

public class URI1011{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        double raio, volume, PI;
        raio = teclado.nextDouble();
        PI = 3.14159;
        volume = (4/3.0) * PI * raio * raio * raio;
        System.out.printf ("VOLUME = %.3f\n",volume);
    }
}