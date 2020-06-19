import java.util.Scanner;

public class Exercicio3{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        float salarioMinimo,quantidadeKW,valorKW,valorPago,valorDesconto;
        System.out.println("Digite o valor do salario minimo:");
        salarioMinimo = teclado.nextFloat();
        System.out.println("Digite a quantidade em KW gasta:");
        quantidadeKW = teclado.nextFloat();
        valorKW = (1/7f)*salarioMinimo/100f;
        valorPago = valorKW * quantidadeKW;
        valorDesconto = 0.9f * valorPago;
        System.out.printf("O valor em reais de cada KW e de: %.2f\n",valorKW);
        System.out.printf("O valor em reais a ser pago e de: %.2f\n",valorPago);
        System.out.printf("O novo valor em reais a ser pago com desconto de 10%%: %.2f\n",valorDesconto);
    }
}