package paciente;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Consultorio {

    protected Queue<Consulta> pacientesPrioridade = new LinkedList<>();
    protected Queue<Consulta> pacientes = new LinkedList<>();
    private int qtdPacientes;

    Consultorio(){
        this.qtdPacientes = 0;
    }

    public boolean chegaPaciente( int RG, int idade) {
        Consulta papel = new Consulta(RG, idade);
        boolean atendimento = true;
        if(qtdPacientes <= 20 ){

                if(idade >= 60){
                System.out.println("Chegou um paciente da fila prioritaria");
                this.pacientesPrioridade.add(papel);
                this.qtdPacientes++;
                    } else {
                System.out.println("Chegou um paciente na fila");        
                this.pacientes.add(papel);
                this.qtdPacientes++;
                }
                
            } else {
            System.out.println("Já foi atendido a quantidade máxima diária de pacientes.");
            atendimento = false;
        }      
        return atendimento;
    }

    public boolean atendePaciente(){

        boolean situacao = true;

        if(this.pacientesPrioridade.size() > 0){
            this.pacientesPrioridade.remove();
        } else if (this.pacientesPrioridade.size() == 0){
            this.pacientes.remove();
        }
        
        if(this.pacientes.size() == 0 && this.pacientesPrioridade.size() == 0){
        situacao = true;
        }

        return situacao;
    } 

    

}
