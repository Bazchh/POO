public class Fatura {
    private String identificacao;
    private String desc;
    private int qntd;
    private double preco;

    Fatura (String identificacao, String desc, int qntd, double preco){
        this.identificacao = identificacao;
        this.desc = desc;
        this.qntd = qntd;
        this.preco = preco;
        setPreco(preco);
        setQntd(qntd);
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getQntd() {
        return qntd;
    }

    public void setQntd(int qntd) {
        if(qntd < 0){
            this.qntd = 0;
        } 
    }

    public double getPreco() {
        return this.preco;
    }

     public void setPreco(double preco) {
        if(preco < 0.0){
            this.preco = 0.0;
            
        } else {
             this.preco = preco;
        }
    }

void imprimeDados(){
    System.out.println("identificação: "+this.identificacao);
    System.out.println("descrição: "+this.desc);
    System.out.println("preço: "+this.preco);
    System.out.println("quantidade: "+this.qntd);
    }

}
