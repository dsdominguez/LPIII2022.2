
//Arquivo para exemplpificar o uso de operadores lógicos

public class Exemplo09{
  public static void main(String [] args){
    double x = 3.1;
    float y = 2.3f;
    int a = 3;
    short b = (short) 2;
    System.out.println("x = " + x + " y = " + y);
    System.out.println("a = " + a + " b = " + b);
    System.out.println("x > y &&  a > b " + ((x > y) &&  (a > b)));
    System.out.println("x > y &&  a < b " + ((x > y) &&  (a < b)));
    System.out.println("x < y &&  a > b " + ((x < y) &&  (a > b)));
    System.out.println("x < y &&  a < b " + ((x < y) &&  (a < b)));
    System.out.println("x > y ||  a > b " + ((x > y) ||  (a > b)));
    System.out.println("x > y ||  a < b " + ((x > y) ||  (a < b)));
    System.out.println("x < y ||  a > b " + ((x < y) ||  (a > b)));
    System.out.println("x < y ||  a < b " + ((x < y) ||  (a < b)));
    System.out.println("!(x > y) " + !(x > y));
    System.out.println("!(x < y) " + !(x < y)); 
  }
}