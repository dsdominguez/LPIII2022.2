package Automovel;

public class ConcessionariaDeAutomoveis {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("Honda Civic", "Graphite", Automovel.Combustivel.GASOLINA);
        AutomovelBasico auto2 = new AutomovelBasico("VW Gol", "Branco", Automovel.Combustivel.ALCOOL, false, false, true);
        AutomovelBasico auto3 = new AutomovelBasico("Fiat Uno", "Preto", Automovel.Combustivel.GASOLINA);
        AutomovelDeLuxo auto4 = new AutomovelDeLuxo("Mercedes Classe A", "Azul metálico", Automovel.Combustivel.DIESEL);

        imprimeAutomovel(auto1);
        imprimeAutomovel(auto2);
        imprimeAutomovel(auto3);
        imprimeAutomovel(auto4);
    }

    public static void imprimeAutomovel(Automovel a){
        System.out.println("\nDados do automóvel escolhido:");
        System.out.print(a); // chamada implícita a toString
        System.out.println("Valor: "+a.quantoCusta());
        System.out.println(a.quantasPrestacoes()+" prestaçoes de R$ "+ (a.quantoCusta()/a.quantasPrestacoes())+"\n");
    }
}
