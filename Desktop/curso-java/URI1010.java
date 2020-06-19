import java.util.Scanner;

public class URI1010{
    public static void main (String []args){
        int codigoPeca,qtdePeca,codigoPeca1,qtdePeca1;
        double valorUnitario,valorUnitario1,total;
        Scanner teclado = new Scanner(System.in);
        codigoPeca = teclado.nextInt();
        qtdePeca = teclado.nextInt();
        valorUnitario = teclado.nextDouble();
        codigoPeca1 = teclado.nextInt();
        qtdePeca1 = teclado.nextInt();
        valorUnitario1 = teclado.nextDouble();
        total = qtdePeca*valorUnitario + qtdePeca1*valorUnitario1;
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}