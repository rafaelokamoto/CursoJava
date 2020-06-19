public class EmpregadoTeste{
    public static void main(String []args){
        Empregado e1, e2, e3;
        e1 = new Empregado ("Maria de Souza","Gerente",15000.00);
        e2 = new Empregado ("Joao da Silva","Diretor", 25000.00);
        e3 = new Empregado ("Joelma Silva","VP",45000.00);

        System.out.println(e1.imprimir());
        System.out.println(e2.imprimir());
        System.out.println(e3.imprimir());

        e1.alterarSalario(1000);
        e1.setCargo("CEO");

        System.out.println(e1.imprimir());
    }
}