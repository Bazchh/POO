package Questão2;

public class Computador extends Equipamento {
    private String monitor;
    private String placaMae;

    public Computador(String mouse, String teclado, String monitor, String placaMae) {
        super(mouse, teclado);
        this.monitor = monitor;
        this.placaMae = placaMae;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    @Override
    public String toString() {
        return super.toString() + "\nPlaca mãe: " + this.placaMae + "\nMonitor: " + this.monitor;
    }

    

}
