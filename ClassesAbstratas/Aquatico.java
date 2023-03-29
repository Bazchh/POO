package ClassesAbstratas;

public abstract class Aquatico extends Veiculo {
    protected double profundidade;

    Aquatico(int capacidade, double profundidade) {
        super(capacidade);
        this.profundidade = profundidade;
        // TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return super.toString() + "\nProfundidade: " + profundidade;
    }

}
