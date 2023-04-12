package paciente;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class TestaConsultorio {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        int delay = 5000;   // tempo de espera antes da 1ª execução da tarefa.
        int interval = 4000;  // intervalo no qual a tarefa será executada.
        Timer timer = new Timer();
        Timer timer2 = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
        int RG;
        int idade;
        boolean atendimento = true;
        boolean atendimento2 = true;
        int atendidos;
        public void run() {
                RG = geradorRandom();
                idade = geradorRandom();
                atendimento = consultorio.chegaPaciente(RG, idade);
                System.out.println(consultorio.getQtdPacientes());
                timer2.schedule(new TimerTask(){
                    public void run(){
                        if(atendimento2 == true){
                            atendimento2 = consultorio.atendePaciente();
                            atendidos++;
                            System.out.println(atendidos);
                        }
                        else if (atendimento2 == false){
                            timer2.cancel();
                        }
                    }
                },delay+2000,interval+6000);
                if(atendimento == false && atendimento2 == false){
                    timer.cancel();
                }    
            } 
        }, delay, interval);    
    }

    public static int geradorRandom(){
        int n;
        Random gerador = new Random();
         n = gerador.nextInt(80);
        return n;
    }

}
