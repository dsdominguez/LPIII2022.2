//Exemplo de atribuição de objetos e tipos primitivos
public class Exemplo07a {
    public static void main(String [] args){
        int a=1;
        int b;

        b = a;
        System.out.println("a= "+ a + " b= "+ b);
        a++;
        System.out.println("a= "+ a + " b= "+ b);

        String str1 = "Computer Science is funny";
        String str2 = "Computer Science is hard";

        System.out.println("str1= "+ str1 + ", str2= "+ str2);

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        str2 = str1; 
        System.out.println("str1= "+ str1 + ", str2= "+ str2);
        
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        
        str1 += "!!!";
        System.out.println("str1= "+ str1 + ", str2= "+ str2);
        
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

    }
    
}
