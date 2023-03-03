public class DemoAgenda {
    public static void main(String[] args) {
        EntradaEmAgenda entrada = new EntradaEmAgenda("12:00", 10, 5, 2001, "Data de aniversario");
        Agenda agenda = new Agenda();
        agenda.adicionaAgenda(entrada, 15, 6, 2022, "13:00", "Dia do mimika");
        
        agenda.adicionaAgenda(entrada, 22, 9, 2009, "15:00", "Dia do joazim");
     
        agenda.adicionaAgenda(entrada, 30, 4, 2025, "20:00", "Dia do aniversario");

        agenda.listDia(30, 4, 2025);
    }
}
