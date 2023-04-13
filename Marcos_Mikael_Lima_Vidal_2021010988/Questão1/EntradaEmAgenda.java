package Questão1;

public class EntradaEmAgenda {
   private int ano;
   private int mes;
   private int dia;
   private String hora;
   private String assunto;

   public EntradaEmAgenda(int ano, int mes, int dia, String hora, String assunto) {
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;
    this.hora = hora;
    this.assunto = assunto;
    }

    

    public EntradaEmAgenda(int ano, int mes, int dia) {
    this.ano = ano;
    this.mes = mes;
    this.dia = dia;
}



    public boolean ehNoDia(int ano, int mes, int dia){
        boolean data;
        if(this.dia == dia && this.ano == ano && this.mes == mes){
            data = true;
        } else {
            data = false;
        }
        return data;
    }


@Override
public String toString() {
    return dia + "/" + mes + "/" + ano + "\nHora: " + hora + "\nAssunto: " + assunto;
}

}