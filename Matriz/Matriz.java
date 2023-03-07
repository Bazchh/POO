public class Matriz{
   private float matriz[2][2];

  public Matriz(float i1,float i2, float i3, float i4){
        this.matriz[0][0] = i1;
        this.matriz[0][1] = i2;
        this.matriz[1][0] = i3;
        this.matriz[1][1] = i4;
   }

public class int calculaDeterminante(){
    int lin;
    int col;
    int determinante;
    determinante = (this.matriz[0][0]*this.matriz[1][1])-(this.matriz[0][1]*this.matriz[0][1]);
    return determinante;
}

public class void imprimeMatriz(){
int lin;
int col;
   
   for(lin = 0; lin < 2; lin++){
      for(col = 0; col < 2; col++){
         System.out.println(this.matriz[lin][col]);      
      }
      System.out.print("\n");
   }
}
   
public class void imprimeDeterminante(int n){
    System.out.println(n);
}

}
