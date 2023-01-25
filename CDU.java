import java.util.Scanner;

public class CDU{
    public static void main(String[] args) {
        int n, c, d, u;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um numero de 3 digitos: ");
        n = entrada.nextInt();
        c = n/100;
        d = (n%100)/10;
        u = ((n%100)%10);
        n = (u*100)+(c*10)+d;
        System.out.println("Numero em formato UCD: "+n);
        entrada.close();
    }
}