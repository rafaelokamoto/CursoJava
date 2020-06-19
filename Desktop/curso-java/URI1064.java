import java.util.Scanner;
public class URI1064{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        double num, media=0;
        for (int i=0; i<6; i++){
            num = teclado.nextDouble();
            if (num > 0){
                cont++;
                media = media + num;
            }
        }
        if (cont !=0){
            media = media / cont;
        }
        System.out.println(cont+ " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}