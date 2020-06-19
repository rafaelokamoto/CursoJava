import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int soma=0,x,y,n,i,j;
        n = input.nextInt();
        for (i=0; i<n;i++){
            soma = 0;
            x = input.nextInt();
            y = input.nextInt();
            for (j = 0; j<y;j++){
                if (x %2 == 0){
                    x = x + 1;
                    soma = soma + x;
                }else{
                    soma = soma + x;
                }
                x = x + 2;
            }
            System.out.println(soma);
        }
    }
}