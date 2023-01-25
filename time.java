import java.util.Scanner;
public class time {
    public static void main(String[] args) {
        int n, days, hours, minutes;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Insira um valor em minutos para realizar a conversão: ");
        n = entrada.nextInt();
        days = n/1440;
        hours = n % 1440/60;
        minutes = n % 60;
        System.out.println(days+" dias "+hours+" horas "+minutes+" minutos");
        entrada.close();
    }
}
