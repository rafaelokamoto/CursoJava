public class Refrigerante{
    private String nome;
    private double preco;
    private int qtde;

    public Refrigerante(String nome, double preco, int qtde){
        this.nome = nome;
        this.preco = preco;
        this.qtde = qtde;
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getQtde(){
        return qtde;
    }
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    public void tirarEstoque(String nome){
        if (qtde <= 0) {
            System.out.println("Não há mais estoque desse refrigerante");
        }
        else {
            qtde--;
            System.out.println("1 refrigerante "+nome+" removido do estoque");
        }
    }
}