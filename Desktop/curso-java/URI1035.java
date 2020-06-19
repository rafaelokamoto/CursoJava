import java.util.Scanner;
public class URI1035{
    public static void main (String [] args){
        int a, b ,c, d, soma, soma1;
        Scanner teclado = new Scanner(System.in);
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        soma = c + d;
        soma1 = a + b;
        if (b > c && d > a && soma > soma1 && c > 0 && d > 0 && a%2 == 0){
            System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores nao aceitos");
        }
    }
}