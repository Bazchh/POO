public class EventoDelegacao{
    private DataHora data;
    private String evento;
    
    public EventoDelegacao(String dia, String mes, String ano, String min, String sec, String evento){
        data = new DataHora(dia, mes, ano, min, sec);
        this.evento = evento;
    }
}