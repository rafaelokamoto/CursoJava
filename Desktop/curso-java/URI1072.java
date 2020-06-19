import java.util.Scanner;
public class URI1072{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int n, num=0, dentroIntervalo=0, foraIntervalo=0;
        n = teclado.nextInt();
        for (int i=0; i < n; i++){
            num = teclado.nextInt();
            if (num >= 10 && num <= 20){
                dentroIntervalo++;
            }
            else {
                foraIntervalo++;
            }
        }
        System.out.println(dentroIntervalo+ " in");
        System.out.println(foraIntervalo+ " out");
    }
}