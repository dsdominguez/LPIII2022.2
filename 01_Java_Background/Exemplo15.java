
public class Exemplo15
{
  public static void main(String [] args){
    int [] [] arrayDeInt = {{1,2,3}, {4,5,6}, {7,8,9}};
    for(int i = 0; i < arrayDeInt.length; i++){
      for(int j = 0; j < arrayDeInt[i].length; j++){
        System.out.print(arrayDeInt[i][j] + " ");
      }
      System.out.println(" ");
    }
  }
}
