import java.util.Scanner;
public class URI1038{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int codigo, qtdeItem;
        codigo = teclado.nextInt();
        qtdeItem = teclado.nextInt();
        double total = 0;
        if (codigo == 1) {
            total = qtdeItem * 4.00;
        }
        else {
            if (codigo == 2){
                total = qtdeItem * 4.50;
            }
            else {
                if (codigo == 3){
                    total = qtdeItem * 5.00;
                }
                else {
                    if (codigo == 4) {
                        total = qtdeItem * 2.00;
                    }
                    else {
                        if (codigo == 5){
                        total = qtdeItem * 1.50;
                    }
                }
                }
            }
        }
        System.out.printf ("Total: R$ %.2f\n",total);
    }
}
