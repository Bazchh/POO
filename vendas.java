import java.util.Scanner;

public class vendas {
   public static void main(String[] args) {
    int setor, valor;
    Scanner ent = new Scanner(System.in);
    System.out.printf(" Insira o codigo do setor: ");
    setor = ent.nextInt();
    System.out.printf(" Insira o valor do produto: ");
    valor = ent.nextInt();
    switch(setor){
        case 111:
        if(valor > 500){
            System.out.println("Setor do produto: eletros.");
            System.out.println("O valor do produto é de: "+(valor-(valor*10)/100));
        }
        break;

        case 222:
        System.out.println("Setor do produto: camas, mesas e banho.");
        if(valor > 100){
            
            System.out.println("O valor do produto é de: "+(valor - (valor*40)/100));
        } 

        else if(valor > 50 && valor < 100){
            System.out.println("O valor do produto é de: "+(valor-(valor*20)/100));
        } 
        
        else if(valor < 50){
            System.out.println("O valor do produto é de: "+(valor-(valor*10)/100));
        }
        
        break;

        default:
        System.out.println("Setor inválido ");

    }
    ent.close();
   }
   
}
