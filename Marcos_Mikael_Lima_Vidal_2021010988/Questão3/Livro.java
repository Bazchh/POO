package Questão3;

public class Livro implements ItemDeBiblioteca {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int anoDeEdicao;
    private boolean emprestimo;
    
    public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
        this.emprestimo = false;
    }

    public String qualTitulo(){
        return "Titulo: " + this.titulo;
    }

    public String qualAutor(){
        return  "Autor: " + this.autor;
    }

    @Override
    public String toString() {
        return "Titulo do livro: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de paginas: " + this.numeroDePaginas + "\nAno de edição: " + this.anoDeEdicao;
    }

    @Override
    public boolean estaEmprestado() {
        
        if(this.emprestimo = true){
            System.out.println("O livro não está em estado de emprestimo");
            return false;
        } else {
            System.out.println("O livro está em estado de emprestimo");
            return true;
        }
        
    }

    @Override
    public void devolve() {
        this.emprestimo = false;
    }

    @Override
    public void empresta() {
        this.emprestimo = true;
    }

    @Override
    public String localizacao(String localizacao) {
        return localizacao;
    }   

    @Override
    public String desc(String desc) {
        return desc;
    }

}
