package ClassesAbstratas;

public abstract class Veiculo {
    private int capacidade;

    Veiculo(int capacidade) {
        this.capacidade = capacidade;
    }

    public abstract void moverFrente();

    @Override
    public String toString() {
        return "Capacidade do veiculo: " + capacidade;
    }

}