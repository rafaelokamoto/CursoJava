public class Livro{
    private String titulo;
    private String autor;
    private int anoDePublicacao;
    private String categoria;
    private int posicaoEstante;
    private int posicaoPrateleira; 
    boolean emprestado;

    public Livro(String titulo, String autor, int anoDePublicacao, String categoria, int posicaoEstante, int posicaoPrateleira, boolean emprestado){
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.categoria = categoria;
        this.posicaoEstante = posicaoEstante;
        this.posicaoPrateleira = posicaoPrateleira;
        this.emprestado = emprestado;
    }

    public String consultaEmprestimo(){
        return "Titulo: "+titulo+" / Autor: "+autor+ " / Ano de Publicacao: "+anoDePublicacao+" / Categoria: "+categoria+ " / Posicao (Estante: "+posicaoEstante+" / Prateleira: "+posicaoPrateleira+") / Emprestado: "+emprestado;
    }
    public void solicitaEmprestimo(){
        if (this.emprestado == false){
            this.emprestado = true;
            System.out.println("Emprestimo realizado");
        }
        else {
            System.out.println("Livro indisponivel, pois ja esta emprestado");
        }
    }
}