public class TestaMatriz{
    int public static void main(String[] args) {
        Matriz m = new Matriz(1,2,3,4);
        int determinante = m.calculaDeterminante();
        m.imprimeDeterminante(determinante);
    }
}