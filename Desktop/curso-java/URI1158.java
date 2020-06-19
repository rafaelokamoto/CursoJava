import java.util.Scanner;
public class URI1158{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int n, x, y, soma=0;
        n = teclado.nextInt();
        for (int i=0; i<n ; i++){
            soma=0;
            x = teclado.nextInt();
            y = teclado.nextInt();
            for (int j=0 ; j<y; j++){
                if (x%2 == 0){
                    x = x + 1;
                    soma = soma + x; 
                }
                else{
                    soma = soma + x;
                }
                x = x + 2;
            }
            System.out.println(soma);
            }
        }
    }