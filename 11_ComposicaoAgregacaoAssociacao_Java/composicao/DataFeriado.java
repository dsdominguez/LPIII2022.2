package composicao;

import base.Data;

public class DataFeriado {
    private Data data;
    private String nomeFeriado;

    //Construtor, validacao inline do atributo nomeFeriado
    DataFeriado(int dia, int mes, int ano, String nomeFeriado){
        data = new Data(dia, mes, ano);
        this.nomeFeriado = (nomeFeriado != null && !nomeFeriado.trim().isEmpty()) ? nomeFeriado : "Sem nome";
    }

    public String toString(){
        return data.toStringLong()+", "+nomeFeriado;
    }
}
