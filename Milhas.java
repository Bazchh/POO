import java.util.Scanner;
import java.text.DecimalFormat;
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
