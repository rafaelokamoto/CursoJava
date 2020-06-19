import java.util.Scanner;

public class Exercicio2h{
    public static void main (String args[]){
        float diametro,raio,altura,volume,pi;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o diametro e a altura do cilindro:");
        diametro = teclado.nextFloat();
        altura = teclado.nextFloat();
        raio = diametro/2;
        pi=3.14f;
        volume = pi*raio*raio*altura;
        System.out.println("O volume do cilindro e de: "+volume);

    }
}