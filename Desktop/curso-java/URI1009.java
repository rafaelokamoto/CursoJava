import java.util.Scanner;

public class URI1009{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        String nome;
        double salarioFixo,montanteVendas,total;
        nome = teclado.next();
        salarioFixo = teclado.nextDouble();
        montanteVendas = teclado.nextDouble(); 
        total = salarioFixo + (montanteVendas*0.15);
        System.out.printf("TOTAL = R$ %.2f\n",total);
    }
}