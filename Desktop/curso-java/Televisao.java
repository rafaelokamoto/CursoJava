// novo tipo de dado
public class Televisao{
    String  marca;
    int     tamanhoTela;
    int     canal;
    int     volume;
    boolean ligada;

    void ligar(){
        ligada = true;
        System.out.println("A TV "+marca+" esta ligada agora");
    }

    void desligar(){
        ligada = false;
        System.out.println("Agora a TV "+marca+" esta desligada");
    }

    void power(){
        ligada = !ligada;
        System.out.println("Status da TV "+marca+" : Ligada = "+ligada);
    }

    void avancarCanal(){
        if (ligada == true){
            if (canal == 99){
                System.out.println("A TV "+marca+" esta no ultimo canal que e "+canal);
            }
            else {
            canal++;
            System.out.println("A TV "+marca+" esta no canal "+canal);
            }
        }
        else{
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void voltarCanal(){
        if (ligada == true){
            if (canal == 1){
                System.out.println("A TV "+marca+" ja esta no canal minimo que e "+canal);
            }
            else {
                canal--;
                System.out.println("A TV "+marca+" esta no canal "+canal);
            }
        }
        else {
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void aumentarVolume(){
        if (ligada == true){
            if (volume >= 10){
                System.out.println ("A TV "+marca+" ja esta no volume maximo que e "+volume);
            }
            else {
                volume++;
                System.out.println ("A TV "+marca+" esta no volume "+volume);
            }
        }
        else {
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void diminuirVolume(){
        if (ligada == true){
            if (volume == 0){
                System.out.println ("A TV "+marca+" ja esta no volume minimo que e "+volume);
            }
            else {
                volume--;
                System.out.println ("A TV "+marca+" esta no volume "+volume);
            }
        }
        else {
            System.out.println("Por favor, antes ligue a TV "+marca);
        }
    }
    void mute(){
        if (volume == 0){
            System.out.println ("A TV "+marca+" ja esta com mute ativado, no volume minimo que e "+volume);
        }
        else {
            volume = 0;
            System.out.println ("A TV "+marca+" esta no mute, com volume "+volume);
        }
    }
}