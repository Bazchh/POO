package Questão4;


import java.util.Stack;

public class Pilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        String[] entrada = {"(",")",")","(",")",")","(", "(", ")", "("};

        for (String texto : entrada){
            if(texto == "("){
                pilha.push(texto);
            } else if (texto == ")"){
                if (pilha.isEmpty()){
                    System.out.println("A pilha está desbalanceada");
                    break;
                } else if (texto == "("){
                    pilha.pop();
                }
            }
        }

    }
}
