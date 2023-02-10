public class Fatura {
    private String numeroDeIdentificacao;
    private String desc;
    private int quantidadeComprada; 
    private double precoUnitario;

    public Fatura(String numeroDeIdentificacao, String desc, int quantidadeComprada, double precoUnitario) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
        this.desc = desc;
        this.quantidadeComprada = quantidadeComprada;
        this.precoUnitario = precoUnitario;
    }

    public String getNumeroDeIdentificacao() {
        return numeroDeIdentificacao;
    }
    public void setNumeroDeIdentificacao(String numeroDeIdentificacao) {
        this.numeroDeIdentificacao = numeroDeIdentificacao;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }
    public void setQuantidadeComprada(int quantidadeComprada) {
        if(this.quantidadeComprada > 0){
            this.quantidadeComprada = quantidadeComprada;
        } else {
            this.quantidadeComprada = 0;
        }
        
    }
    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }   

    public double calculoTotal(){
        return this.quantidadeComprada * this.precoUnitario;
    }
    
}
