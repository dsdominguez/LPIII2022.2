

import java.util.Scanner;

public class Exemplo12{
  public static void main(String [] args){
    // Gera um número aleatório entre 1 e 100
    int númeroAleatório = (int) (Math.random()*100) + 1;
    boolean ganhou = false;
    int vezes = 5;
    int chute;
    System.out.println("Foi escolhido um número entre 1 e 100.");
    System.out.println("Você tem " + vezes + " oportunidade(s). Adivinha:");

    Scanner scanner = new Scanner(System.in);
    // Criando um loop para perguntar ao jogador seu chute
    for(int i = vezes; i > 0; i--){
      // Lendo a entrada do usuário para comparar com o núemro gerado
      chute = scanner.nextInt();
      // Falando para o jogador se o número é menor que ...
      if (númeroAleatório < chute){
        System.out.println("É menor que " + chute +  ".");
      } //ou maior que o número chutado
      else if(númeroAleatório > chute){
        System.out.println("É maior que " + chute +  ".");
      } // Se o chute esta correto saia do loop
      else{
        ganhou = true;
        break;
      }
      if (i > 1){
        System.out.println("Você tem " + (i-1) + " oportunidade(s) restantes.");
        System.out.println("Chute novamente: ");
      }
    }
    // and tell them they've won
    if (ganhou){
      System.out.println("CORRETO... VOCÊ GANHOU!!!");
    } else {
      // If they used up all 10 guesses end the loop and tell they've lost
      System.out.println("GAME OVER... VOCÊ PERDEU!!!");
      System.out.println("O número: " + númeroAleatório);
    }
  }
}





















