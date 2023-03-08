public class TestaMatriz{
   public static void main(String[] args){
       Matriz m = new Matriz(3,14,1,6);
        float determinante = m.calculaDeterminante();
        m.imprimeDeterminante(determinante);
        m.imprimeMatriz();
   }
}