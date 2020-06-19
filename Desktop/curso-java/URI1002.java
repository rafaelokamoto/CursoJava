import java.util.Scanner;

public class URI1002{
    public static void main (String []args){
        double raio,area,n;
        Scanner teclado = new Scanner(System.in);
        n=3.14159;
        raio = teclado.nextDouble();
        area = n*raio*raio;
        System.out.printf("A=%.4f\n",area);
    }
}