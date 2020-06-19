import java.util.Scanner;
public class URI1031{
    public static void main (String [] args){
        double a, b, c, delta = 0, x1 = 0, x2 = 0, raiz = 0;
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        delta = (b * b) - (4 * a * c);
        if (a == 0) {
            System.out.println("Impossivel calcular");
        }
        else {
            if (delta < 0) {
                System.out.println("Impossivel calcular");
            }
            else {
                raiz = Math.sqrt(delta);
                x1 = (-b + raiz)/(2*a);
                x2 = (-b - raiz)/(2*a);
                System.out.printf("R1 = %.5f\n",x1);
                System.out.printf("R2 = %.5f\n",x2);
            }
        }
    }
}