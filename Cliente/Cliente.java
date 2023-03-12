
public class Cliente {
    private int id;
    private String nome;
    private String idade;
    private String telefone;

    public Cliente(int id, String nome, String idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    
    public String toString(){
        return "Id do cliente: "+id+" Nome do cliente: "+nome+" Idade: "+idade+" Telefone: "+telefone;
    }
}

