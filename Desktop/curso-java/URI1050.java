import java.util.Scanner;
public class URI1050{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int numDDD;
        numDDD = teclado.nextInt();
        if (numDDD == 61){
            System.out.println("Brasilia");
        }
        else{
            if (numDDD == 71){
            System.out.println("Salvador");
        }
        else {
            if (numDDD == 11) {
                System.out.println("Sao Paulo");
            }
            else {
                if (numDDD == 21) {
                    System.out.println("Rio de Janeiro");
                }
                else {
                    if (numDDD == 32){
                        System.out.println("Juiz de Fora");
                    }
                    else {
                        if (numDDD == 19){
                            System.out.println("Campinas");
                        }
                        else {
                            if (numDDD == 27){
                                System.out.println("Vitoria");
                            }
                            else {
                                if (numDDD == 31){
                                    System.out.println("Belo Horizonte");
                            }
                            else {
                                System.out.println("DDD nao cadastrado");
                            }
                        }
                    }
                }
            }
            
        }
        }
    }
}
}
