public class LivroTeste{
    public static void main(String[]args){
        Livro l1, l2, l3, l4, l5;
        l1 = new Livro ("Teste","Teste2",1999,"Teste3",2,3,false);
        l2= new Livro ("Teste1","Teste3",2001,"Teste42",6,9,true);
        l3= new Livro ("Teste12","Teste33",3001,"Teste45",6,9,true);
        l4= new Livro ("Teste32","Teste66",4001,"Teste47",6,9,false);
        l5= new Livro ("Teste44","Teste99",5001,"Teste49",6,9,false);

        System.out.println(l1.consultaEmprestimo());
        System.out.println(l2.consultaEmprestimo());
        l1.solicitaEmprestimo();
        l2.solicitaEmprestimo();
        System.out.println(l1.consultaEmprestimo());
        System.out.println(l2.consultaEmprestimo());
    }
}