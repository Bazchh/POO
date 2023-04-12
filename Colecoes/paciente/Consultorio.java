package paciente;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Consultorio {

    protected Queue<Paciente> pacientesPrioridade = new LinkedList<>();
    protected PriorityQueue<Paciente> pacientes = new PriorityQueue<>();
    private int qtdPacientes;

    Consultorio(){
        this.qtdPacientes = 0;
    }

    public boolean chegaPaciente( int RG, int idade) {
        Paciente paciente = new Paciente(RG, idade);
        boolean atendimento = true;
        if(qtdPacientes < 20 ){
                if(idade >= 60){
                System.out.println("Chegou um paciente na fila prioritaria");
                this.pacientesPrioridade.offer(paciente);
                this.qtdPacientes++;
                    } else {
                System.out.println("Chegou um paciente na fila");        
                this.pacientes.offer(paciente);
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

        if(!this.pacientes.isEmpty() || !this.pacientesPrioridade.isEmpty()){
          if(!this.pacientesPrioridade.isEmpty()){
            this.pacientesPrioridade.remove();
            System.out.println("Foi atendido um paciente da fila prioritaria");
        } else if (!this.pacientesPrioridade.isEmpty()){
            this.pacientes.remove();
            System.out.println("Foi atendido um paciente da fila comum");
        }
        
        if(this.pacientes.isEmpty() && this.pacientesPrioridade.isEmpty()){
            situacao = false;
        }
}
        return situacao;
    }

    public int getQtdPacientes() {
        return qtdPacientes;
    } 

    

}
