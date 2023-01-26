import java.util.Scanner;

public class menor{
 public static void main(String[] args) {
     int n2, n1;
     Scanner entrada = new Scanner(System.in);
    System.out.print("Insira um numero: ");
    n1 = entrada.nextInt();
    System.out.print("Insira um numero: ");
    n2 = entrada.nextInt();
    if(n1 < n2){
        System.out.println("O menor numero é: "+n1);
    } else if(n2 < n1){
        System.out.println("O menor numero é: "+n2);
    }
    entrada.close();
 }
}