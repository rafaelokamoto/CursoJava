import java.util.Scanner;

public class URI1014{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        int distanciaPercorrida;
        double totalCombustivel,consumoMedio;
        distanciaPercorrida = teclado.nextInt();
        totalCombustivel = teclado.nextDouble();
        consumoMedio = distanciaPercorrida/totalCombustivel;
        System.out.printf ("%.3f km/l\n",consumoMedio);
    }
}