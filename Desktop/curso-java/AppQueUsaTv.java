public class AppQueUsaTv{
    public static void main(String args[]){
        Televisao t;          // declaro a TV
        t = new Televisao();  // solicito memória para armazenar a estrutura
                              // Televisao t = new Televisao();

        t.marca = "Samsung";
        t.tamanhoTela = 42;
        t.ligada = false;
        t.canal = 1;
        t.volume = 10;

        Televisao x = new Televisao();
        x.marca = "LG";
        x.tamanhoTela = 55;
        x.ligada = true;
        x.canal = 99;
        x.volume = 5;

        t.power();
        x.power();
        x.power();
        t.voltarCanal();
        x.voltarCanal();
        x.avancarCanal();
        x.avancarCanal();
        t.aumentarVolume();
        x.diminuirVolume();
        x.diminuirVolume();
        x.diminuirVolume();
        x.diminuirVolume();
        x.diminuirVolume();
        x.diminuirVolume();
        x.mute();
        t.diminuirVolume();
        t.mute();
    }
}