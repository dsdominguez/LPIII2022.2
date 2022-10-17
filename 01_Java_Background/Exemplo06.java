//Exemplo para mostrar a conversão de tipos

public class Exemplo06 {
    public static void main(String [] args){
        int i1 = 1000, i2, i3;
        byte b1 = 5, b2;

        float f1 = 500.25f, f2;
        double d1 = 1000.50, d2, d3;

        String str1 = "Tipo String ", str2, str3 = "3.0";

        //Mudanças de tipo com variáveis inteiras
        i2 = i1 + b1;
        //b2 = i1 + b1;

        //Mudanças de tipo com ponto flutuante
        d2 = d1 + f1;
        //f2 = d1 + f1;
        f2 = (float)d1 + f1;

        //Mudanças de tipo entre inteiros e ponto flutuante
        d3 = d2 + i2;
        //i3 = d2 + i2;
        i3 = (int) (d2 + i2);

        //Mudanças de tipo entre numericos e string
        str2 = str1 + d1;
        //d3 = str1 + d1;
        //d3 = (double)str3 + d1;
    }        
}
