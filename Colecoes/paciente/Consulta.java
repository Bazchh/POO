package paciente;

public class Consulta extends Paciente {
    private int hora;
    private int min;

    Consulta(int RG, String nome, int idade, int hora, int min) {
        super(RG, nome, idade);
        this.hora = hora;
        this.min = min;
    }

}
