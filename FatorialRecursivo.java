import java.util.Scanner;

public class FatorialRecursivo {
 public static void main(String[] args) {
    int n;
    Scanner ent = new Scanner(System.in);
    System.out.print("valor: ");
    n = ent.nextInt();
    System.out.println("O fatorial de "+n+" é: "+fat(n));
    ent.close();
 }   

 public static int fat(int num){
    if(num == 0){
        return 1;
    } else if(num > 0) {
        return (num*fat(num-1));
    }
    return 0;
 }

}


