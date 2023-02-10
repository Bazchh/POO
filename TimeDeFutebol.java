public class TimeDeFutebol {
    private int quantidadeDeJogadores;
    private String nomeDoTime;
    private String campeonatoQuePariticipa;
    private String nomeDoTecnico;

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }

    public void setQuantidadeDeJogadores(int quantidadeDeJogadores) {
        if(this.quantidadeDeJogadores > 0 ){
            this.quantidadeDeJogadores = quantidadeDeJogadores;
        }
        
    }

    public String getNomeDoTime() {
        return nomeDoTime;
    }

    public void setNomeDoTime(String nomeDoTime) {
        if(!this.nomeDoTime.isEmpty()){
            this.nomeDoTime = nomeDoTime;
        } else {
            System.out.println("Nome do tecnico não pode ficar vazio");
        }
        
    }

    public String getCampeonatoQuePariticipa() {
        return campeonatoQuePariticipa;
    }

    public void setCampeonatoQuePariticipa(String campeonatoQuePariticipa) {
        if(!this.campeonatoQuePariticipa.isEmpty()){
            this.campeonatoQuePariticipa = campeonatoQuePariticipa;
        }
        
    }

    public String getNomeDoTecnico() {
        return nomeDoTecnico;
    }

    public void setNomeDoTecnico(String nomeDoTecnico) {
        if(!this.nomeDoTecnico.isEmpty()){
            this.nomeDoTecnico = nomeDoTecnico;
        }

    }

    public void alterarTecnico(String novoTecnico){
            this.nomeDoTecnico = novoTecnico;
    }

    public void mostraDadosDoTime(){
        System.out.println("Quantidade de jogadores: "+this.quantidadeDeJogadores+" \nNome do time: "+this.nomeDoTime+" \nNome do tecnico: "+nomeDoTecnico+" \nCampeonato que participa: "+campeonatoQuePariticipa);
    }

    

    public TimeDeFutebol(int quantidadeDeJogadores, String nomeDoTime, String campeonatoQuePariticipa,
            String nomeDoTecnico) {
        this.quantidadeDeJogadores = quantidadeDeJogadores;
        this.nomeDoTime = nomeDoTime;
        this.campeonatoQuePariticipa = campeonatoQuePariticipa;
        this.nomeDoTecnico = nomeDoTecnico;
    }   
}
