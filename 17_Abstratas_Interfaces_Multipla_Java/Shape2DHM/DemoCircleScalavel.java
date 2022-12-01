package Shape2DHM;

import Shape2D.Ponto2D;
import Shape2D.Shape2D;

public class DemoCircleScalavel {
    public static void main(String[] args){
        CircleScalavel ce = new CircleScalavel(new Ponto2D(10,10), 30);
        System.out.println(ce);
        System.out.println("Area: "+ce.calArea()+"\n");

        ce.changeSize(2);
        System.out.println(ce);
        System.out.println("Area: "+ce.calArea()+"\n");

        ce.reflectShape();
        System.out.println(ce+"\n");

        System.out.println(ce instanceof CircleScalavel);
        System.out.println(ce instanceof Shape2D);
        System.out.println(ce instanceof Scalavel);
    }
}
