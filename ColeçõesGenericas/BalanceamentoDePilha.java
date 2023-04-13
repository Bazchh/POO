
import java.util.Stack;

public class PilhaBalanceado {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        String[] texto = { "(", "(", ")", "(", "(", ")", "(", ")", ")", ")", "(" };
        boolean balance = true;
        for (String letra : texto) {
            if (letra == "(") {
                pilha.push(letra);
            } else if (letra == ")") {
                if (pilha.isEmpty()) {
                    balance = false;
                    break;
                } else if (pilha.peek() == "(") {
                    pilha.pop();
                }
            }
        }
        if (balance) {
            System.out.println("A string está balanceada");
        } else {
            System.out.println("A string está desbalanceada");
        }

    }

}
