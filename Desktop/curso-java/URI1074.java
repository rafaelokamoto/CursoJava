import java.util.Scanner;
public class URI1074{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int n, numero=0;
        n = teclado.nextInt();
        for (int i=0 ; i < n ; i++) {
            numero = teclado.nextInt();
            if (numero == 0){
                System.out.println("NULL");
            }
            else{
                if (numero > 0 && numero%2 == 0){
                    System.out.println("EVEN POSITIVE");
                }
                else {
                    if (numero > 0 && numero%2 != 0) {
                        System.out.println("ODD POSITIVE");
                    }
                    else {
                        if (numero < 0 && numero%2 == 0){
                            System.out.println("EVEN NEGATIVE");
                        }
                        else {
                            if (numero < 0 && numero%2 != 0){
                                System.out.println("ODD NEGATIVE");
                            }
                        }
                    }
                }
            }

        }
    }
}