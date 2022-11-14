package base;

public class ExampleData {
    public static void main(String[] args) {
        Data data1 = new Data();
        Data data2 = new Data(29, 5, 2022);
        Data data3 = new Data(-1, 2, 1980);

        System.out.println(data1.toStringShort());
        System.out.println(data2.toStringShort());
        System.out.println(data3.toStringShort());

        System.out.println(data1.toStringLong());
        System.out.println(data2.toStringLong());
        System.out.println(data3.toStringLong());
    }
}
