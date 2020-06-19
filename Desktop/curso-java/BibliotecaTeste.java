import java.util.Scanner;
public class BibliotecaTeste{ 
    public static void main(String args[]){ 
        Biblioteca n1,n2,n3,n4,n5;  
            n1 = new Biblioteca(1,"Livro1","AAutor1",1987,"Suspense","2J4D",true);
            n2 = new Biblioteca(2,"Livro2","AAutor3",1987,"ET","2J4D",false);
            n3 = new Biblioteca(3,"Livro3","AAutor15",1987,"TI","D3G5",false);
            n4 = new Biblioteca(4,"Livro4","AAutor12",1987,"Suspense","2J4D",true);
            n5 = new Biblioteca(5,"Livro5","AAutor1",1987,"Drama","F4S2",false);
            
            System.out.println(n1.imprimir());
            System.out.println(n2.imprimir());
            System.out.println("");
            n1.solicitaEmprestimo();
            n2.solicitaEmprestimo();
            System.out.println(n1.imprimir());
            System.out.println(n2.imprimir());
            System.out.println("");
        } 
    }