package composicao;

public class ExampleDataFeriado {
    public static void main(String[] args) {
        DataFeriado data1 = new DataFeriado(16, 6, 2022, "Corpus Chisti");
        DataFeriado data2 = new DataFeriado(23, 6, 2022, "Sao Joao");
        DataFeriado data3 = new DataFeriado(24, 12, 2022, "Natal");

        System.out.println(data1.toString());
        System.out.println(data2.toString());
        System.out.println(data3.toString());

        //O metodo da classe base nao esta disponivel
        //System.out.println(data1.toStringLong());

        //O encapsulamento impede acessar os métodos da classe base
        System.out.println(data1.data.toStringLong());
    }
}
