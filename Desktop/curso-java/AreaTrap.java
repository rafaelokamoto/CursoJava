import java.util.Scanner;

public class AreaTrap{
    public static void main (String []args){
        float baseMaior,baseMenor,altura,area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base maior, a base menor e a altura do Trapezio:");
        baseMaior = teclado.nextFloat();
        baseMenor = teclado.nextFloat();
        altura = teclado.nextFloat();
        area = (baseMaior+baseMenor)*altura/2;
        System.out.println ("A area do trapezio e: "+area);
    }
}