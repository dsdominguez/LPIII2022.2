

/*
  Calcular o valor do ingresso considerando as seguintes regras:
  1. O valor cheio é R$ 25,00
  2. Menores de 12 anos pagam meia
  3. Maiores de 60 pagam meia
  4. Estudantes pagam meia
*/
public class Exemplo10b
{
  public static void main(String [] args){
    double valorDoIngresso = 25.00;
    int idade = 10;
    //int idade = 15;
    //int idade = 62;
    boolean éEstudante = true;
    //boolean éEstudante = false;
    if(idade <= 12){
      valorDoIngresso = 12.50;
    }else if(idade >= 60){
      valorDoIngresso = 12.50;
    }else if( éEstudante ){
      valorDoIngresso = 12.50;
    }
    System.out.println("O Valor do Ingresso é " + valorDoIngresso);
  }
}
