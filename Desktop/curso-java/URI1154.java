import java.util.Scanner;
public class URI1154{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int idade, contador=0;
        double media=0;
        idade = teclado.nextInt();
        while(idade>0){
            contador++;
            media = media + idade;
            idade = teclado.nextInt();
        }
        media = media/contador;
        System.out.printf("%.2f\n",media);
    }
}