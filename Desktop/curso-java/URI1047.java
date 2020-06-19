import java.util.Scanner;
public class URI1047{
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        int horaInicial=0, minutoInicial=0, horaFinal=0, minutoFinal=0, somaHora=0, somaMinuto=0, tempMinutoInicial=0, tempMinutoFinal=0;
        horaInicial = teclado.nextInt();
        minutoInicial = teclado.nextInt();
        horaFinal = teclado.nextInt();
        minutoFinal = teclado.nextInt();
        if (horaInicial == horaFinal && minutoInicial == minutoFinal){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else {
            tempMinutoInicial = minutoInicial + (horaInicial * 60);
            tempMinutoFinal = minutoFinal + (horaFinal * 60);
            somaMinuto = tempMinutoFinal - tempMinutoInicial;
            if (somaMinuto < 60 && somaMinuto > 0){
                System.out.println("O JOGO DUROU 0 HORA(S) E "+somaMinuto+ " MINUTO(S)");
            }
            else {
                if(somaMinuto < 0){
                    somaMinuto = 0 - minutoInicial;
                    somaHora = 24 - horaInicial;
                    if (somaMinuto < 0){
                        somaMinuto = 60 + somaMinuto;
                        somaHora = somaHora - 1;
                    }
                    tempMinutoInicial = somaMinuto + (somaHora * 60);
                    somaMinuto = minutoFinal + tempMinutoInicial;
                    somaHora = horaFinal + (somaMinuto / 60);
                    somaMinuto = somaMinuto % 60;
                    System.out.println("O JOGO DUROU " +somaHora+ " HORA(S) E "+somaMinuto+ " MINUTO(S)");
                }
                else {
                somaHora = somaMinuto / 60;
                somaMinuto = somaMinuto % 60;
                System.out.println("O JOGO DUROU " +somaHora+ " HORA(S) E "+somaMinuto+ " MINUTO(S)");
            }
        }
    
        }
    }
}