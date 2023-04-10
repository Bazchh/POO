
import java.util.*;

public class colec {
    public static void main(String[] args) {
        LinkedList<String> lista1 = new LinkedList<String>(Arrays.asList("m", "i", "k", "a", "e", "l"));
        LinkedList<String> invertido = new LinkedList<>();
        ListIterator<String> iterator = lista1.listIterator();
        invertido = reverseLinkedList(lista1);

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }

        iterator = invertido.listIterator();

        while (iterator.hasNext()) {
            String elemento = iterator.next();
            System.out.println(elemento);
        }
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> lista1) {

        LinkedList<String> lista2 = new LinkedList<>();
        for (int i = lista1.size() - 1; i >= 0; i--) {
            lista2.add(lista1.get(i));
        }

        return lista2;
    }
}
