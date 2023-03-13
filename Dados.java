import java.util.Random;
import java.util.ArrayList;
public class Dados{
    
    public static int lancarDados(){
        Random dado1 = new Random();
        Random dado2 = new Random();
        return (calculaDados(dado1, dado2));
    }


    public static int calculaDados(Random dado1, Random dado2){
        int num = dado1.nextInt(6)+dado2.nextInt(6);
        return num;
    }
    
    public static int contagemDeSoma(ArrayList <Integer> contagem){
        
        for(int i = 0; i < congatem.size(); i++){
            if(contagem.get(i) == 2){
                
            } else if(contagem.get(i) == 3){
                
            } else if(contagem.get(i) == 4){
                
            } else if(contagem.get(i) == 5){
                
            } else if(contagem.get(i) == 6){
                
            } else if(contagem.get(i) == 7){
                
            } else if(contagem.get(i) == 8){
                
            } else if(contagem.get(i) == 9){
                
            } else if(contagem.get(i) == 10){
                
            } else if(contagem.get(i) == 11){
                
            } else if(contagem.get(i) == 12){
                
            }  
        }
    }
}
