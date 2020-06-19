import java.util.Scanner;
public class URI1142{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int n, num1=1, num2=2, num3=3;
        n = teclado.nextInt();
        for (int i=0; i<n ;i++){
            System.out.println(num1+" "+num2+" "+num3+" PUM");
            num1+=4;
            num2+=4;
            num3+=4;
        }
    }
}