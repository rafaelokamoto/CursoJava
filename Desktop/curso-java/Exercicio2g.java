import java.util.Scanner;
public class Exercicio2g{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        float lado1,lado2,lado3,volume;
        System.out.println("Digite os 3 lados do cubo:");
        lado1 = teclado.nextFloat();
        lado2 = teclado.nextFloat();
        lado3 = teclado.nextFloat();
        volume = lado1 * lado2 * lado3;
        System.out.println("O volume do cubo e: " +volume);
    }
}