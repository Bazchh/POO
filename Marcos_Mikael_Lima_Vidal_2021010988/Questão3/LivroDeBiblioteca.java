package Questão3;

public class LivroDeBiblioteca extends Livro {
    private String localizacao;
    private String desc;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, String localizacao,
            String desc) {

        super(titulo, autor, numeroDePaginas, anoDeEdicao);
        this.localizacao = localizacao;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLocalização do livro: " + this.localizacao + "\nDescrição do livro: " + this.desc;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public String getDesc() {
        return desc;
    }
    
    
    

}
