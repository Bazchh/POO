
import java.util.ArrayList;

public class Clientes {
    private ArrayList <Cliente> clientela;

    public Clientes(){
        this.clientela = new ArrayList<>();
    }

    public void adicionaCliente(Cliente entrada, int id, String nome, String idade, String telefone){
        entrada = new Cliente(id, nome, idade, telefone);
        this.clientela.add(entrada);
    }
    
    public void imprimeClientes(){
        String str;
        for(int i = 0; i < this.clientela.size(); i++){
            str = clientela.get(i).toString();
            System.out.println(str);
        }
    }
    
}
