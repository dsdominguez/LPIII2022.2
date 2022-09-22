

/*
  Dado o número de mês retornar o nome
*/
public class Exemplo11
{
  public static void main(String [] args){
    int qualMês = 3;
    String nomeDoMês;
    switch(qualMês) {
      case 1:
        nomeDoMês = "Janeiro";
        break;
      case 2:
        nomeDoMês = "Fevereiro";
        break;
      case 3:
        nomeDoMês = "Março";
        break;
      case 4:
        nomeDoMês = "Abril";
        break;
      case 5:
        nomeDoMês = "Maio";
        break;
      case 6:
        nomeDoMês = "Junho";
        break;
      case 7:
        nomeDoMês = "Julho";
        break;
      case 8:
        nomeDoMês = "Agosto";
        break;
      case 9:
        nomeDoMês = "Setembro";
        break;
      case 10:
        nomeDoMês = "Outubro";
        break;
      case 11:
        nomeDoMês = "Novembro";
        break;
      case 12:
        nomeDoMês = "Dezembro";
        break;
      default:
        nomeDoMês = "Não esta definido";
    }
    System.out.println("O mês " + qualMês + " é " + nomeDoMês);

  }
}
