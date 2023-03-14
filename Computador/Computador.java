
public class Computador extends Equipamento
{
    protected String placaDeVideo;
    protected String memoriaRam;
    
    public Computador(String memoriaRam, String placaDeVideo, String mouse, String monitor){
        super(mouse, monitor);
        this.placaDeVideo = placaDeVideo;
        this.memoriaRam = memoriaRam;
        
    }
    
    public String getPlacaDeVideo(){
        return this.placaDeVideo;
    }
    
    public String getMemoriaRam(){
        return this.memoriaRam;
    }
    
    public void setPlacaDeVideo(String placaDeVideo){
        this.placaDeVideo = placaDeVideo;
    }
    
    public void setMemoriaRam(String memoriaRam){
        this.memoriaRam = memoriaRam;
    }
    
    public String toString(){
        return "Memoria ram: "+memoriaRam+" placa de video: "+placaDeVideo+super.toString();
    }
}
