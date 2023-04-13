package Questão1;

import java.util.*;

public class Agenda {
    private ArrayList <EntradaEmAgenda> agenda;

    public Agenda() {
        this.agenda = new ArrayList<>();
    }
    
    public void adicionaCompromisso(int dia, int mes, int ano, String hora, String assunto){
        EntradaEmAgenda novaEntrada = new EntradaEmAgenda(ano, mes, dia, hora, assunto);
        this.agenda.add(novaEntrada);
    }
    
    public void listaDia(int dia, int mes, int ano){
       EntradaEmAgenda entrada = new EntradaEmAgenda(ano, mes, dia);
       EntradaEmAgenda entrada2; 
       for(int i = 0; i < this.agenda.size(); i++){
            entrada2 = this.agenda.get(i);
            if(entrada.ehNoDia(ano, mes, dia) == entrada2.ehNoDia(ano, mes, dia)){
                System.out.println(entrada2.toString());
            }
        }

    }
        
}
