import java.util.Scanner;

public class AreaLos{
    public static void main (String []args){
        float diagonal1, diagonal2, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Digite as diagonais do losango:");
        diagonal1 = teclado.nextFloat();
        diagonal2 = teclado.nextFloat();
        area = diagonal1*diagonal2;
        System.out.println ("A area do losango e: "+area);
    }
}