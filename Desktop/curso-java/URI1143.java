import java.util.Scanner;
public class URI1143{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        int n,quadrado = 0,cubo = 0;
        n = teclado.nextInt();
        for (int i=1; i<=n; i++){
            quadrado = i * i;
            cubo = i * i * i;
            System.out.println(i+ " "+quadrado+" "+cubo);
        }
    }
}