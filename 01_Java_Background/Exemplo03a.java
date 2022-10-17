public class Exemplo03a {
    public static void main(String [] args){
        final int a = 1;

        System.out.println("a = " + a);
        //a++; //erro pelo uso de final

        for (int i = 0; i < 5; i++){
            System.out.println("i = " + i);
        }

        //System.out.println("i = " + i); //erro de escopo
    }
}