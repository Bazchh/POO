public class CaixaBanco {
    private static int clientesAtendidos = 0;
    private int numeroCaixa;
    
    public CaixaBanco(int numeroCaixa){
        this.numeroCaixa = numeroCaixa;
    }

public void iniciaAtendimento(){
    clientesAtendidos++;
    }
    public static void imprimeClientes(){
        System.out.println(clientesAtendidos);
    }

}
