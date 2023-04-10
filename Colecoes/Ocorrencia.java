
import java.util.ArrayList;
import java.util.TreeMap;

public class Ocorrencia {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();
        String texto = "HELLO THERE";
        ArrayList<String> lista = new ArrayList<>();
        int qtd;
        for (int i = 0; i < texto.length(); i++) {
            lista.add(texto.substring(i, Math.min(i + 1, texto.length())));
        }
        for (int i = 0; i < lista.size(); i++) {
            if (mapa.containsKey(lista.get(i))) {
                qtd = mapa.get(lista.get(i));
                mapa.put(lista.get(i), qtd + 1);
            } else {
                mapa.put(lista.get(i), 1);
            }
        }
        for (String letra : mapa.keySet()) {
            System.out.println(letra + " " + mapa.get(letra));
        }
    }
}
