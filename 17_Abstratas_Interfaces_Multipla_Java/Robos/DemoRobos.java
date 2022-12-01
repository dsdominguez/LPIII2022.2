package Robos;

public class DemoRobos {
    public static void main(String[] argumentos) {
        // Criamos e manipulamos um robô que é uma instância da classe RoboSimples
        RoboSimples exp = new RoboSimples("Explorer", 0, 0, 90);
        System.out.println(exp+"\n");
        exp.move(10); // posição será 0,10
        System.out.println(exp+"\n");
        exp.mudaDirecao(180);
        exp.move(); // posição será -1,10
        exp.move(); // posição será -2,10     
        System.out.println(exp+"\n");      

        // Criamos e manipulamos um robô que é uma instância da classe RoboABateria
        RoboComBateria walk = new RoboComBateria("Walker",0,0, 90,105);
        System.out.println(walk+"\n");
        walk.move(10);//posicao 0,10 energia 5
        System.out.println(walk+"\n");
        walk.mudaDirecao(180);//direcao 180
        walk.move();//nao se move, sem energia
        walk.move();//nao se move, sem energia
        System.out.println(walk+"\n");        

        //Criamos e manipulamos um robo complexo, com movimento na diagonal
        RoboComplexo tom = new RoboComplexo("Tomas", 0, 0, 90);
        System.out.println(tom+"\n");
        tom.move(10);//posicao 0,10
        System.out.println(tom+"\n");
        tom.mudaDirecao(45);//direcao 45
        tom.move(5);//posicao 5,10
        System.out.println(tom+"\n");

        //RoboAbstrato Imag = new RoboAbstrato("Imaginario", 0, 0, 180);
        RoboAbstrato Imag1 = new RoboSimples("Imaginario", 0, 0, 180);
        System.out.println(Imag1+"\n");
        System.out.println("Robo Abstrato: "+ (Imag1 instanceof RoboAbstrato));
        System.out.println("Robo Simples: "+ (Imag1 instanceof RoboSimples));
        System.out.println("Robo Complexo: "+ (Imag1 instanceof RoboComplexo));        
        System.out.println("Robo ComBateria:"+ (Imag1 instanceof RoboComBateria) + "\n");
        
    }
}
