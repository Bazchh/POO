package Cliente;


import java.util.Scanner;

public class TestaCliente {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int id;
        String nome;
        String telefone;
        String idade;
        Cliente c = new Cliente(0, "0", "0", "0");
        Clientes listaClientes = new Clientes();
        do{

            System.out.println("Insira o id do cliente: ");
            id = ent.nextInt();
            System.out.println("Insira o nome do cliente: ");
            nome = ent.nextLine();
            System.out.println("Insira a idade do cliente: ");
            idade = ent.nextLine();
            System.out.println("Insira o telefone do cliente: ");
            telefone = ent.nextLine();
            listaClientes.adicionaCliente(c, id, nome, idade, telefone);
        }while(id < 0 );

        ent.close();
    }
}
