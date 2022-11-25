package Automovel;

public class ExampleAutomovel {
    public static void main(String[] args) {
        Automovel auto1 = new Automovel("Honda Civic", "Graphite", Automovel.Combustivel.GASOLINA);
        System.out.println("AUTOMOVEL 1:\n"+auto1);//Chamada implicita ao metodo toString()
        System.out.println("Preço: R$ "+auto1.quantoCusta());
        System.out.println("Prestacoes: "+auto1.quantasPrestacoes()+"\n");

        AutomovelBasico auto2 = new AutomovelBasico("VW Gol", "Branco",
        Automovel.Combustivel.ALCOOL, false, false, true);
        System.out.println("AUTOMOVEL 2:\n"+auto2);
        System.out.println("Preço: R$ "+auto2.quantoCusta());
        System.out.println("Prestacoes: "+auto2.quantasPrestacoes()+"\n");

        AutomovelBasico auto3 = new AutomovelBasico("Fiat Uno", "Preto",
        Automovel.Combustivel.GASOLINA);
        System.out.println("AUTOMOVEL 3:\n"+auto3.toString());
        System.out.println("Preço: R$ "+auto3.quantoCusta());
        System.out.println("Prestacoes: "+auto3.quantasPrestacoes()+"\n");

        AutomovelDeLuxo auto4 = new AutomovelDeLuxo("Mercedes Classe A", "Azul metálico",
        Automovel.Combustivel.DIESEL);
        System.out.println("AUTOMOVEL 4:\n"+auto4);
        System.out.println("Preço: R$ "+auto4.quantoCusta());
        System.out.println("Prestacoes: "+auto4.quantasPrestacoes()+"\n");
    }
}
