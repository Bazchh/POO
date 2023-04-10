package paciente;

import java.util.ArrayList;

public class Consultorio {

    protected ArrayList<Consulta> pacientes = new ArrayList<>();

    public void chegaPaciente(Consulta papel, int RG, int idade, String nome, int hora, int min) {
        papel = new Consulta(RG, nome, idade, hora, min);
        this.pacientes.add(papel);
    }

}
