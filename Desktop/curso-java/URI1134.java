import java.util.Scanner;
public class URI1134{
    public static void main (String[]args){
        Scanner teclado = new Scanner(System.in);
        int codigo, alcool=0, gasolina=0, diesel=0;
        codigo = teclado.nextInt();
        while (codigo != 4){
            if (codigo < 1 || codigo > 4){
                codigo = teclado.nextInt();
            }
            else {
                if (codigo == 1){
                    alcool++;
                }
                else {
                    if (codigo == 2){
                        gasolina++;
                    }
                    else {
                        if (codigo == 3){
                            diesel++;
                        }
                    }
                }
                codigo = teclado.nextInt();
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+alcool);
        System.out.println("Gasolina: "+gasolina);
        System.out.println("Diesel: "+diesel);
    }
}