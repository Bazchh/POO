import java.util.Scanner;
import java.util.Calendar;

public class Cartao {
    public static void main(String[] args) {
        String nome;
        int num, cod, cep, ano, anoAtual, mesAtual;
        Scanner ent = new Scanner(System.in);
        Calendar Calendario = Calendar.getInstance();
        mesAtual = Calendario.get(Calendar.MONTH)+1;
        anoAtual = Calendario.get(Calendar.YEAR);
        System.out.println(mesAtual+"/"+anoAtual);
        ent.close();
    }
}
