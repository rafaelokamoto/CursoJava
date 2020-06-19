import java.util.Scanner;

public class Exercicio5{
    public static void main (String []args){
        float tempoViagem,velocidadeMedia,distancia,litrosUtilizados;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite o tempo gasto na viagem:");
        tempoViagem = teclado.nextFloat();
        System.out.println("Digite a velocidade media:");
        velocidadeMedia = teclado.nextFloat();
        distancia = tempoViagem*velocidadeMedia;
        litrosUtilizados = distancia/12f;
        System.out.printf ("Voce percorreu uma distancia de %.3f utilizando %.3f litros de combustivel\n",distancia,litrosUtilizados);
    }
}