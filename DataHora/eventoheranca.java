public class EventoHeranca extends DataHora{
    private String eventoHeranca;
    public EventoHeranca(String eventoHeranca, String dia, String mes, String ano, String min, String sec){
        super(dia, mes, ano, min, sec);
        this.eventoHeranca = eventoHeranca;
    }
}