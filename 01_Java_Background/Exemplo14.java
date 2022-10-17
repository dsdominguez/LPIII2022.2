public class Exemplo14
{
    public static void main(String [] args){
        int [] [] arrayDeInt = {{1,2,3}, {4,5,6}, {7,8,9}};
        System.out.println("Matriz Inicial:");
        prnMatrix(arrayDeInt);
        modifyMatrix(arrayDeInt);
        System.out.println("Matriz Final:");
        prnMatrix(arrayDeInt);

        int n = 1;
        System.out.println("n = " + n);
        modifyInt(n);
        System.out.println("n = " + n);
    }

    public static void prnMatrix(int [][] vec){
        for(int i = 0; i < vec.length; i++){
            for(int j = 0; j < vec[i].length; j++){
                System.out.print(vec[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void modifyMatrix(int [][] vec){
        for(int i = 0; i < vec.length; i++){
            for(int j = 0; j < vec[i].length; j++){
                vec[i][j] = vec[i][j]*10;
            }
        }
    }

    public static void modifyInt(int val){
        val = val *10;
    }
}

