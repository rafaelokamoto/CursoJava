import java.util.Scanner;
public class URI1144{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int n,quadrado,cubo,tempQuadrado,tempCubo;
        n = input.nextInt();
        for (int i=1; i<=n; i++){
            quadrado = i * i;
            cubo = i * i * i;
            tempQuadrado = quadrado+1;
            tempCubo = cubo+1;
            System.out.println(i+ " "+quadrado+" "+cubo);
            System.out.println(i+ " "+tempQuadrado+ " "+tempCubo);
        }
        }
    }