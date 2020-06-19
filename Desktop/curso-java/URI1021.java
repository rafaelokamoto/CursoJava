import java.util.Scanner;
public class URI1021{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int notasCem, notasCinq, notasVinte, notasDez, notasCinco, notasDois, moedasCinq, moedasVinteCinco, moedasDez, moedasCinco, moedasUm,valorInt,valorIntCent,resto,restoMoedas;
        double valor;
        valor = teclado.nextDouble();
        valorInt = (int)valor;
        valor = (valor - valorInt)*100;
        valorIntCent = (int)valor;
        notasCem = valorInt / 100;
        resto = valorInt % 100;
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
        moedasCinq = valorIntCent / 50;
        restoMoedas = valorIntCent % 50;
        moedasVinteCinco = restoMoedas / 25;
        restoMoedas = restoMoedas % 25;
        moedasDez = restoMoedas / 10;
        restoMoedas = restoMoedas % 10;
        moedasCinco = restoMoedas / 5;
        restoMoedas = restoMoedas % 5;
        System.out.println("NOTAS:");
        System.out.println(notasCem + " nota(s) de R$ 100.00");
        System.out.println(notasCinq + " nota(s) de R$ 50.00");
        System.out.println(notasVinte + " nota(s) de R$ 20.00");
        System.out.println(notasDez + " nota(s) de R$ 10.00");
        System.out.println(notasCinco + " nota(s) de R$ 5.00");
        System.out.println(notasDois + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(resto + " moeda(s) de R$ 1.00");
        System.out.println(moedasCinq + " moeda(s) de R$ 0.50");
        System.out.println(moedasVinteCinco + " moeda(s) de R$ 0.25");
        System.out.println(moedasDez + " moeda(s) de R$ 0.10");
        System.out.println(moedasCinco + " moeda(s) de R$ 0.05");
        System.out.println(restoMoedas   + " moeda(s) de R$ 0.01");
    }
}