import java.util.Scanner;

public class Exercicio4{
    public static void main (String[]args){
        float valorHoraTrabalhada,quantidadeHoras,percentualDesconto,salarioLiquido;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da hora trabalhada:");
        valorHoraTrabalhada = teclado.nextFloat();
        System.out.println("Digite a quantidade de horas:");
        quantidadeHoras = teclado.nextFloat();
        System.out.println("Digite o percentual de desconto em %:");
        percentualDesconto = teclado.nextFloat();
        salarioLiquido = (valorHoraTrabalhada*quantidadeHoras*(100f - percentualDesconto))/100f;
        System.out.printf ("O valor do salario liquido e de %.2f\n",salarioLiquido);
    }
}