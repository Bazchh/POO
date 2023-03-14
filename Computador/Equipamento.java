public class Equipamento{
    protected String mouse;
    protected String monitor;
    
    public Equipamento(String mouse, String monitor){
        this.mouse = mouse;
        this.monitor = monitor;
    }
    
    public String getMouse(){
        return this.mouse;
    }
    
    public String getMonitor(){
        return this.monitor;
    }
    
    public void setMouse(String mouse){
        this.mouse = mouse;
    }
    
    public void setMonitor(String monitor){
        this.monitor = monitor;
    }
    
    public String toString(){
        return " mouse: "+mouse+" monitor: "+monitor;
    }
    
}