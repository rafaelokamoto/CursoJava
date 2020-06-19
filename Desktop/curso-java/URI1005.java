import java.util.Scanner;
public class URI1005{
    public static void main (String []args){
        double notaA,notaB,media;
        Scanner teclado = new Scanner(System.in);
        notaA = teclado.nextDouble();
        notaB = teclado.nextDouble();
        media = (notaA*3.5+notaB*7.5)/11;
        System.out.printf("MEDIA = %.5f\n",media);
    }
}