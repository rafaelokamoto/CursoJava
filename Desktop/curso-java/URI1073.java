import java.util.Scanner;
public class URI1073{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int n, quadrado, SIMBOLOQUADRADO=2;
        n = input.nextInt();
        for (int i = 2; i <=n ; i+=2){
            if (i%2 == 0){
                quadrado = i * i;
                System.out.println(+i+ "^" +SIMBOLOQUADRADO+ " = "+quadrado);
            }
        }
    }
}