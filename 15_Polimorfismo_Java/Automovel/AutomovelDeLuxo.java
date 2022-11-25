package Automovel;

public class AutomovelDeLuxo extends AutomovelBasico{
    private static final int NUM_MAX_PRESTACOES = 36;

    private boolean direcaoHidraulica;
    private boolean cambioAutomatico;
    private boolean vidroTravaEletricos;

    AutomovelDeLuxo(String model, String color, Combustivel combustivel,
                    boolean retrovisor, boolean limpador, boolean multimedia,
                    boolean direcao, boolean cambio, boolean vidro){

        super(model, color, combustivel, retrovisor, limpador, multimedia);
        direcaoHidraulica = direcao;
        cambioAutomatico = cambio;
        vidroTravaEletricos = vidro;
    }

    AutomovelDeLuxo(String model, String color, Combustivel combustivel){
        super(model, color, combustivel);
        direcaoHidraulica = true;
        cambioAutomatico = true;
        vidroTravaEletricos = true;
    }

    /*
    Anotações em Java

    Anotação &Override, o método deve existir na superclasse, previne que modifiquemos a assinatura na superclasse
    é o método sobreposto, se convirta em um método da subclasse

    Evolução do Java, para criar códigos de POO mais robustos
     */
    @Override
    public float quantoCusta() {
        float preco = super.quantoCusta();

        if (direcaoHidraulica) preco += 5340;
        if (cambioAutomatico) preco += 7500;
        if (vidroTravaEletricos) preco += 2320;

        return preco;
    }

    public int quantasPrestacoes(){
        return NUM_MAX_PRESTACOES;
    }

    public String toString(){
        String resultado = super.toString();

        if (direcaoHidraulica)
            resultado += "Com direção hidraúlica\n";
        if (cambioAutomatico)
            resultado += "Com câmbio automático\n";
        if (vidroTravaEletricos)
            resultado += "Com vidros e travas elétricas\n";

        return resultado;
    }
}
