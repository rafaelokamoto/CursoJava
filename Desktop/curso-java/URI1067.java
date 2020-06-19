import java.util.Scanner;
public class URI1067{
    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);
        int x;
        x = teclado.nextInt();
        for (int i=0; i <=x; i++){
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}