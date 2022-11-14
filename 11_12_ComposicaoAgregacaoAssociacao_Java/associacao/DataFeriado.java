package associacao;

import base.Data;

public class DataFeriado {
    private Data data;
    private String nomeFeriado;

    DataFeriado(Data data, String nomeFeriado){
        this.data = data;
        this.nomeFeriado = (nomeFeriado != null && !nomeFeriado.trim().isEmpty()) ? nomeFeriado : "Sem nome";
    }

    public String toString(){
        return ", "+nomeFeriado;
    }
}
