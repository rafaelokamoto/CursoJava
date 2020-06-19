import java.util.Scanner;

public class VolPara{
    public static void main (String[]args){
        float altura,largura,profundidade,volume;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a altura, largura e profundidade do Paralelepipedo:");
        altura = teclado.nextFloat();
        largura = teclado.nextFloat();
        profundidade = teclado.nextFloat();
        volume = altura*largura*profundidade;
        System.out.println("O volume do paralelepipedo e: "+volume);
    }
}