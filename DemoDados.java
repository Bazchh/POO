import java.util.ArrayList;

public class DemoDados {
    
    public static void main (String[] args) {
       ArrayList <Integer> contagem = new ArrayList<>();
    int r;
    int i;
    for( i = 0; i < 36000; i++){
        r = Dados.lancarDados();
        contagem.add(r);
        }
    }
    
}
