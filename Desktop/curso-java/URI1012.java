import java.util.Scanner;
public class URI1012{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        double a,b,c,area;
        double PI = 3.14159;
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        area = (a * c) / 2;
        System.out.printf("TRIANGULO: %.3f\n",area);
        area = PI * c * c;
        System.out.printf("CIRCULO: %.3f\n",area);
        area = ((a + b) / 2) * c;
        System.out.printf("TRAPEZIO: %.3f\n",area);
        area = b * b;
        System.out.printf("QUADRADO: %.3f\n",area);
        area = a * b;
        System.out.printf("RETANGULO: %.3f\n",area);
    }
}