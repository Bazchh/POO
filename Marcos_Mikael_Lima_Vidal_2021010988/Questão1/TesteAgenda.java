package Questão1;

public class TesteAgenda {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        agenda.adicionaCompromisso(12, 5, 2001, "2:32", "Aniversario");
        agenda.adicionaCompromisso(14, 7, 2002, "23:32", "Evento");
        agenda.adicionaCompromisso(8, 8, 2015, "12:32", "BGS");
        agenda.adicionaCompromisso(21, 2, 2003, "20:32", "Evento3");
        agenda.adicionaCompromisso(12, 5, 2001, "3:32", "Evento2");

        agenda.listaDia(12, 5, 2001);
        
    }
}
