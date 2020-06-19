import java.util.Scanner;
public class URI1164{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int n,x,soma=0,contador=0;
        n = teclado.nextInt();
        for (int i=0; i<n ; i++){
            soma = 0;
            contador = 0;
            x = teclado.nextInt();
            while (soma < x && contador != x && x > 1){
                ++contador;
                soma = soma + contador;
            }
            if (soma == x && soma != 0){
                System.out.println(x+ " eh perfeito");
            }
            else{
                System.out.println(x+ " nao eh perfeito");
            }
        }
    }
}