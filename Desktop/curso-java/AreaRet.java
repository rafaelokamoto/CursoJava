import java.util.Scanner;

public class AreaRet{
    public static void main (String []args){
        float base, altura, area;
        Scanner teclado = new Scanner(System.in);
        System.out.println ("Digite a base e a altura do retangulo");
        base = teclado.nextFloat();
        altura = teclado.nextFloat();
        area = base * altura;
        System.out.println ("A area do retangulo e: "+area);
    }
}