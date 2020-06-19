import java.util.Scanner;
public class URI1060{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int cont=0;
        float num = 0;
        for (int i=0 ; i<6; i++){
            num = teclado.nextFloat();
            if (num>0) {
                cont++;
            }
        }
        System.out.println(cont+ " valores positivos");
    }
}