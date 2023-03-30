package ClassesAbstratas.Geometria;

public class Principal {
    public static void main(String[] args) {
        Quadrado q = new Quadrado();
        Triangulo t = new Triangulo();
        Circulo c = new Circulo();
        Desenho desenho1 = new Desenho(q, t, 2, 3, 6, 1);
        desenho1.apresenta();
    }
}
