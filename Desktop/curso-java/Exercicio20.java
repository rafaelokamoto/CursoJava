import java.util.Scanner;
public class Exercicio20{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int sexo;
        double altura,pesoIdeal;

        System.out.println("Para saber o peso ideal digite a altura da pessoa:");
        altura = teclado.nextDouble();
        System.out.println("Digite o sexo da pessoa no formato: 0 para homens e 1 para mulheres");
        sexo = teclado.nextInt();
        if (sexo == 0) {
            pesoIdeal = (72.7 * altura) - 58.0;
            System.out.printf ("O peso ideal e de: %.2f kgs\n",pesoIdeal);
        }
        if (sexo == 1) {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.printf ("O peso ideal e de: %.2f kgs\n",pesoIdeal);
        }
        if (sexo != 0 && sexo != 1) {
            System.out.println("Opcao de sexo invalida!");
        }
    }
}