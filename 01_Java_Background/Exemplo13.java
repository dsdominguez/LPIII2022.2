
import java.util.Random;
import java.util.Scanner;

//Arquivo para exemplpificar a implementação d e uma classse
public class Exemplo13{
  public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
    // implementação do corpo da função main		
		System.out.println("Implementando funçoes");
		System.out.println("Classse Random: As instâncias desta classe sao usadas");
		System.out.println("para gerar um fluxo de números pseudo-aleatórios");
		System.out.println("Simulando 10 lançamentos de um dado:");
		System.out.println("Escolhendo a semente de forma automatica");
		jogaOsDados(1, 6, 10, 0);
		System.out.println("Diferente da funçao rand() de C, esta classe utiliza sementes diferentes a cada execuçao!");
		long semente;
		System.out.println("Entre com a semente para gerar uma nova sequencia: ");
		semente = sc.nextLong();
		jogaOsDados(1, 6, 10, semente);
		System.out.println("Sementes diferentes irao gerar resultados diferentes!");
		System.out.println("A mesma semente gera o mesmo resultado!");
  }


  public static void jogaOsDados(int min, int tam, int qtVezes, long semente){
		Random rand = new Random();
		if (semente > 0)
			rand.setSeed(semente);
		System.out.print("( ");
		int dado;
		for(int i = 1; i <= qtVezes; i++){
			dado = min + rand.nextInt(tam);
			System.out.print(dado);
			if (i < qtVezes)
				System.out.print(", ");
			else
				System.out.println(" )");
		}
	}
}