import java.text.DecimalFormat;

public class Matriz{
   private float matriz[][] = new float[2][2];

  public Matriz(float i1,float i2, float i3, float i4){
        this.matriz[0][0] = i1;
        this.matriz[0][1] = i2;
        this.matriz[1][0] = i3;
        this.matriz[1][1] = i4;
   }

public float calculaDeterminante(){
    float determinante;
    determinante = (this.matriz[0][0]*this.matriz[1][1])-(this.matriz[0][1]*this.matriz[0][1]);
    return determinante;
}

public void imprimeMatriz(){
int lin;
int col;
   
   for(lin = 0; lin < 2; lin++){
      for(col = 0; col < 2; col++){
         DecimalFormat df = new DecimalFormat(); //Serve para formatar um numero e utiliza-lo dentro do println ou do print (system.out.print ou system.out.println)
         System.out.print(df.format(this.matriz[lin][col])+"  ");      
      }
      System.out.print("\n");
   }
}


public void imprimeDeterminante(float n){
    System.out.println(n);
}

}
