public class Time {
    public static void main(String[] args) {
        TimeDeFutebol corinthians = new TimeDeFutebol(-10, "Corinthians", "brasileirao", "juca");
        corinthians.getCampeonatoQuePariticipa();
        corinthians.mostraDadosDoTime();
        corinthians.alterarTecnico("Mikael");
        corinthians.mostraDadosDoTime();
    }

}
