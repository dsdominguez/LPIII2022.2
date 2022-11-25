package Automovel;

public class Automovel {
    public static enum Combustivel{
        GASOLINA,
        ALCOOL,
        DIESEL,
        GAS
    }

    private static final int NUM_MAX_PRESTACOES = 24;

    private String modelo;
    private String cor;
    private Combustivel combustivel;

    Automovel(String modelo, String cor, Combustivel combustivel){
        this.modelo = modelo;
        this.cor = cor;
        this.combustivel = combustivel;
    }

    public float quantoCusta(){
        float preco = 0;

        switch (combustivel){
            case GASOLINA: preco = 12000.0f; break;
            case ALCOOL:   preco = 10500.0f; break;
            case DIESEL:   preco = 11000.0f; break;
            case GAS:      preco = 13000.0f; break;
        }

        return preco;
    }

    public int quantasPrestacoes(){
        return NUM_MAX_PRESTACOES;
    }

    public String toString() {
        String resultado;

        resultado = modelo+" "+cor+"\n";
        switch(combustivel){
            case GASOLINA:  resultado += "Movido a Gasolina"; break;
            case ALCOOL:    resultado += "Movido a Alcool"; break;
            case DIESEL:    resultado += "Movido a Diesel"; break;
            case GAS:       resultado += "Movido a Gás"; break;
        }

        return resultado;
    }
}
