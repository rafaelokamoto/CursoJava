public class Biblioteca{ 
    private int id;
    private String titulo; 
    private String autor; 
    private int ano; 
    private String categoria;
    private String posicao;
    private boolean emprestimo;

public Biblioteca (int id, String titulo, String autor, int ano, String categoria, String posicao, boolean emprestimo){ 
    this.id = id;
    this.titulo = titulo; 
    this.autor = autor;
    this.ano = ano;
    this.categoria = categoria;
    this.posicao = posicao;
    this.emprestimo = emprestimo;       
}

public void setTitulo(String titulo){ 
    this.titulo = titulo; 
} 
public String getTitulo(){ 
    return this.titulo; 
}
public void setAutor(String autor){
    this.autor = autor;
}
public String getAutor(){
    return this.autor;
}
public void setAno(int ano){
    this.ano = ano;
}
public int getAno(){
    return this.ano;
}
public void setCategoria(String categoria){
    this.categoria = categoria;
}
public String getCategoria(){
    return this.categoria;
}
public void setPosicao(String posicao){
    this.posicao = posicao;
}
public String getPosicao(){
    return this.posicao;
}
public void setEmprestimo(boolean emprestimo){
    this.emprestimo = emprestimo;
}
public boolean getEmprestimo(){
    return this.emprestimo;
}

public String imprimir(){ 
    return this.id+"-"+this.titulo+" - "+this.autor+" - "+this.ano+" - "+this.categoria+" - "+this.posicao+" - "+this.emprestimo;
} 

public void solicitaEmprestimo(){
    if(this.emprestimo == false){
        this.emprestimo = true;
        System.out.println("Emprestimo realizado!");
    }else {
        System.out.println("Livro indisponivel!");
    }
}

}