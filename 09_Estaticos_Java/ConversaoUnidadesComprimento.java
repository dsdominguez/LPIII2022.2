public class ConversaoUnidadesComprimento {

    public static double polegadasParaCentimetros(double polegadas){
        return polegadas*2.54;
    }

    public static double pesParaCentimetros(double pes){
        return pes*30.48;
    }

    public static double milhasParaQuilometros(double milhas){
        return milhas*1.609;
    }

    public static void main(String[] args){
        ConversaoUnidadesComprimento objConv = new ConversaoUnidadesComprimento();

        //Using instance
        System.out.println("Usando uma instancia do objeto");
        System.out.println("20 pés sao "+ objConv.pesParaCentimetros(20) +" centímetros.");
        System.out.println("5 polegadas sao "+ objConv.polegadasParaCentimetros(5) +" centímetros.");
        System.out.println("2 milhas sao "+ objConv.milhasParaQuilometros(2) +" quilometros.");

        //Using class definition
        System.out.println("\nUsando a definiçao da classe");
        System.out.println("20 pés sao "+ ConversaoUnidadesComprimento.pesParaCentimetros(20) +" centímetros.");
        System.out.println("5 polegadas sao "+ ConversaoUnidadesComprimento.polegadasParaCentimetros(5) +" centímetros.");
        System.out.println("2 milhas sao "+ ConversaoUnidadesComprimento.milhasParaQuilometros(2) +" quilometros.");
    }

}
