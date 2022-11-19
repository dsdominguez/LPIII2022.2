package associacao;

import base.Data;

public class ExampleDataFeriado {
    public static void main(String[] args) {
        Data data1 = new Data(16, 6, 2022);
        DataFeriado dataFer1 = new DataFeriado(data1,"Corpus Chisti");

        Data data2 = new Data(23, 6, 2022);
        DataFeriado dataFer2 = new DataFeriado(data2, "Sao Joao");

        System.out.println(data1.toStringLong() + dataFer1.toString());
        System.out.println(data2.toStringLong() + dataFer2.toString());

        //O encapsulamento impede o acesso aos metodos da classe base via atributo
        //System.out.println(dataFer1.data.toStringLong());
    }
}
