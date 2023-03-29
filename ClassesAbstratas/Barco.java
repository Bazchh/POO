package ClassesAbstratas;

public class Barco extends Aquatico {
    private String nome;
    private String cadBarco;

    public Barco(int capacidade, double profundidade, String nome, String cadBarco) {
        super(capacidade, profundidade);
        this.nome = nome;
        this.cadBarco = cadBarco;
    }

    public void moverFrente() {
        System.out.print("O veiculo se moveu para frente");
    }

    @Override
    public String toString() {
        return super.toString() + "\nCad do barco: " + cadBarco + "\nNome do barco: " + nome;
    }
}
