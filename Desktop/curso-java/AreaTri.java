import java.util.Scanner;

public class AreaTri{
    public static void main (String[]args){
        float base,altura,area;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a base e a altura do triangulo:");
        base = teclado.nextFloat();
        altura = teclado.nextFloat();
        area = (base+altura)/2;
        System.out.println("A area do triangulo e:"+area);
    }
    
}