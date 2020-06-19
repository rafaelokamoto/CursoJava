import java.util.Scanner;
public class URI1018{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int valor, notasCem, notasCinq, notasVinte, notasDez, notasCinco, notasDois, resto;
        valor = teclado.nextInt();
        notasCem = valor / 100;
        resto = valor % 100;
        notasCinq = resto / 50;
        resto = resto % 50;
        notasVinte = resto / 20;
        resto = resto % 20;
        notasDez = resto / 10;
        resto = resto % 10;
        notasCinco = resto / 5;
        resto = resto % 5;
        notasDois = resto / 2;
        resto = resto % 2;
        System.out.println(valor);
        System.out.println(notasCem + " nota(s) de R$ 100,00");
        System.out.println(notasCinq + " nota(s) de R$ 50,00");
        System.out.println(notasVinte + " nota(s) de R$ 20,00");
        System.out.println(notasDez + " nota(s) de R$ 10,00");
        System.out.println(notasCinco + " nota(s) de R$ 5,00");
        System.out.println(notasDois + " nota(s) de R$ 2,00");
        System.out.println(resto + " nota(s) de R$ 1,00");
    }
}