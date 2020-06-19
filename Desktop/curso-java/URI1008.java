import java.util.Scanner;

public class URI1008{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int numFunc, horasTrab;
        double valorHora,salario;
        numFunc = teclado.nextInt();
        horasTrab = teclado.nextInt();
        valorHora = teclado.nextDouble();
        salario = valorHora*horasTrab;
        System.out.println("NUMBER = "+numFunc);
        System.out.printf ("SALARY = U$ %.2f",salario);
    }
}