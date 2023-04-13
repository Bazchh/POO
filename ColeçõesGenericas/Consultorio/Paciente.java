package paciente;

public class Paciente  implements Comparable{
    protected int RG;
    protected int idade;

    Paciente(int RG, int idade) {
        this.RG = RG;
        this.idade = idade;
    }

    @Override
    public int compareTo(Object o) {
        return idade;
    }

}
