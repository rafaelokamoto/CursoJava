import java.util.Scanner;
public class URI1160{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        int t, pa, pb, anos=0;
        double g1, g2, tempPa, tempPb;
        t = teclado.nextInt();
        for (int i=0; i<t; i++){
            anos = 0;
            pa = teclado.nextInt();
            pb = teclado.nextInt();
            g1 = teclado.nextDouble();
            g2 = teclado.nextDouble();
            if (anos < 100) {
                while (pa <= pb){
                    tempPa = pa * g1/100;
                    tempPb = pb * g2/100;
                    pa = pa + (int)tempPa;
                    pb = pb + (int)tempPb;
                    anos=anos + 1;
            }
        }
        if (anos <= 100){
            System.out.println(anos+ " anos.");
        }
        else {
            System.out.println("Mais de 1 seculo.");
        }
            
        }
    }
}