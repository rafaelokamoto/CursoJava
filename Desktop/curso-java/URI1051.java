import java.util.Scanner;
public class URI1051{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        double salario = 0,imposto = 0,faixa1 = 0,faixa2 = 0;
        salario = teclado.nextDouble();
        if (salario <= 2000){
            System.out.println("Isento");
        }
        else {
            if (salario > 2000 && salario <= 3000){
                imposto = salario - 2000;
                imposto = imposto * 0.08;
                System.out.printf("R$ %.2f\n",imposto);
            }
            else{
                if (salario > 3000 && salario <= 4500){
                    imposto = salario - 3000;
                    faixa1 = 1000 * 0.08;
                    imposto = imposto * 0.18;
                    imposto = imposto + faixa1;
                    System.out.printf("R$ %.2f\n",imposto);
                }
                else {
                    if (salario > 4500){
                        imposto = salario - 4500;
                        faixa1 = 1000 * 0.08;
                        faixa2 = 1500 * 0.18;
                        imposto = imposto * 0.28;
                        imposto = imposto + faixa1 + faixa2;
                        System.out.printf("R$ %.2f\n",imposto);
                    }
                }
            }
        }
    }
}