package Questão3;

public interface ItemDeBiblioteca {
    final int maximoDeDiasParaEmprestimo = 14;
    
    public abstract boolean estaEmprestado();
    public abstract void devolve();
    public abstract void empresta();
    public abstract String localizacao(String a);
    public abstract String desc(String a);


}
