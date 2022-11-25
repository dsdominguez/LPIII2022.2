package Automovel;

public class AutomovelBasico extends Automovel{
   private boolean retrovisorDoLadoDoPassageiro;
   private boolean limpadorDoVidroTraseiro;
   private boolean centralMultimedia;

   AutomovelBasico(String model, String color, Combustivel combustivel,
                   boolean retrovisor, boolean limpador, boolean multimedia){
       super(model, color, combustivel);
       retrovisorDoLadoDoPassageiro = retrovisor;
       limpadorDoVidroTraseiro = limpador;
       centralMultimedia = multimedia;
   }

    AutomovelBasico(String model, String color, Combustivel combustivel){
        super(model, color, combustivel);
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        centralMultimedia = true;
    }

    public float quantoCusta(){
        float preço = super.quantoCusta();

        if (retrovisorDoLadoDoPassageiro) preço += 280;
        if (limpadorDoVidroTraseiro) preço += 650;
        if (centralMultimedia) preço += 190;

        return preço;
    }

    public String toString(){
       String resultado = super.toString();

       if (retrovisorDoLadoDoPassageiro)
           resultado += "\nCom retrovisor do lado do pasageiro";
       if (limpadorDoVidroTraseiro)
           resultado += "\nCom limpador do vidro traseiro";
       if (centralMultimedia)
           resultado += "\nCom central multimedia";

       return resultado;
    }

}
