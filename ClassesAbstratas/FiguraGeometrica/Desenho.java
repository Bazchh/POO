package ClassesAbstratas.Geometria;

public class Desenho {
    private FiguraGeometrica figura1;
    private float x1;
    private float y1;
    private float x2;
    private float y2;
    private FiguraGeometrica figura2;

    public Desenho(FiguraGeometrica figura1, FiguraGeometrica figura2, float x1, float y1, float x2, float y2) {
        this.figura1 = figura1;
        this.figura2 = figura2;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

    public void apresenta() {
        System.out.println("Coordenadas da figura 1\nx: " + this.x1 + "\ny:" + this.y1);
        System.out.println("Coordenadas da figura 2\nx: " + this.x2 + "\ny:" + this.y2);
    }

}
