package Questão3;

public class DemoBiblioteca {
    public static void main(String[] args) {
    LivroDeBiblioteca livro = new LivroDeBiblioteca("Star Wars", "Queria que fosse eu", 532, 2025, "Corredor 5, ala de livros ficticios", "Historias no espaço");
    System.out.println(livro.desc(livro.getDesc()));
    System.out.println(livro.localizacao(livro.getLocalizacao()));
    System.out.println(livro.estaEmprestado());
    livro.empresta();
    System.out.println(livro.estaEmprestado());
    livro.devolve();
    System.out.println(livro.estaEmprestado());
    livro.empresta();
    System.out.println(livro.estaEmprestado());
    System.out.println(livro.qualAutor());
    System.out.println(livro.qualTitulo());
    System.out.println(livro.toString());
    }
}
