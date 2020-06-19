import java.util.Scanner;

public class Area{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Digite o lado do quadrado para calcular a area:");
        float lado, area;
        lado = teclado.nextFloat();
        area = lado * lado;
        System.out.println ("A area do quadrado e igual a "+area);
    }
}