import java.util.Scanner;
public class URI1040{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        float n1, n2, n3, n4, media, exame;
        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        n3 = teclado.nextFloat();
        n4 = teclado.nextFloat();
        media = (n1 * 2 + n2 * 3 + n3 * 4 + n4 *1) / 10;
        if (media >= 7){
            System.out.printf("Media: %.1f\n",media);
            System.out.println("Aluno aprovado.");
        }
        else {
            if (media >= 5 && media <=6.9){
                System.out.printf("Media: %.1f\n",media);
                System.out.println("Aluno em exame.");
                exame = teclado.nextFloat();
                System.out.printf("Nota do exame: %.1f\n",exame);
                media = (media + exame) / 2;
                if (media >= 5) {
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n",media);
                }
                else {
                    System.out.println ("Aluno reprovado.");
                    System.out.printf("Media final: %.1f\n",media);
                }
            }
            else{
                System.out.printf("Media: %.1f\n",media);
                System.out.println("Aluno reprovado.");
            }
        }
    }
}