package Questão2;

public class Equipamento {
    private String mouse;
    private String teclado;

    public Equipamento(String mouse, String teclado) {
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public String getMouse() {
        return mouse;
    }

    public String getTeclado() {
        return teclado;
    }

    @Override
    public String toString() {
        return "Mouse: " + this.mouse + "\nTeclado: " + this.teclado;
    }

    

}
