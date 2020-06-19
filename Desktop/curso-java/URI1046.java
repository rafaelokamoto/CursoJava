import java.util.Scanner;
public class URI1046{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int valor, valor1, tempo;
        valor = input.nextInt();
        valor1 = input.nextInt();
        if (valor == valor1){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else {
            if (valor < valor1) {
                tempo = valor1 - valor;
                System.out.println("O JOGO DUROU " +tempo+ " HORA(S)");
            }
            else {
                if (valor > valor1){
                    tempo = 24 - valor;
                    tempo = tempo + valor1;
                    System.out.println("O JOGO DUROU " +tempo+ " HORA(S)");
                }
            }
        }
    }
}