import java.util.ArrayList;

public class Agenda {
    private ArrayList <EntradaEmAgenda> compromissos;
    
    public Agenda() {
        compromissos = new ArrayList<>();
    }
    
    public void adicionaAgenda(EntradaEmAgenda entrada, int dia, int mes, int ano, String hora, String assunto){
        entrada = new EntradaEmAgenda(hora, dia, mes, ano, assunto);
        compromissos.add(entrada);
    }

    public void listDia(int dia, int mes, int ano){
        String str;
        for(int i = 0; i < this.compromissos.size(); i++){
           if(compromissos.get(i).ehNoDia(dia, mes, ano)){
               str = compromissos.get(i).toString();
               System.out.println(str);
           }
        }
    }

}
