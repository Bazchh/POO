import java.util.Scanner; //Usado para criar um scanner que vai ler algum valor inserido(string,inteiro, float, double,etc)
import java.text.DecimalFormat; //Usado para mudar o formato que uma variavel é exibida numa saida de texto na tela
public class Milhas {
    public static void main(String[] args) {
        double kmph = 0.0, mps, mph, fps;
     
        Scanner ent = new Scanner(System.in);
        System.out.println("km/h\t/ms\tm/h\tfps");
        while(kmph <= 50.0){
            mps = kmph*0.2778;
            mph = kmph*0.6214;
            fps = kmph*0.9113;
            System.out.println(new DecimalFormat("00.00").format(kmph)+"\t"+new DecimalFormat("00.00").format(mps)
            +"\t"+ new DecimalFormat("00.00").format(mph)+"\t"+ new DecimalFormat("00.00").format(fps));
            
            kmph += 0.5;
        }
    }
}
