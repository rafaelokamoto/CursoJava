import java.util.Scanner;
public class URI1145{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int x,y,contY=1,contX;
        x = teclado.nextInt();
        y = teclado.nextInt();
        for (int i = 1; i <= y; i+=x){
            contX = 1;
            while (contX <= x){
                if (contX == x){
                System.out.printf("%d",contY);
                contY=contY+1;
                contX=contX+1;
                }
                else {
                System.out.printf("%d ",contY);
                contY=contY+1;
                contX=contX+1;
                }
            }
            System.out.print("\n");
            }
        }
    }