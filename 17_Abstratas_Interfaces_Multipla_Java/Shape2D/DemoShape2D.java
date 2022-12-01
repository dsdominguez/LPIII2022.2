package Shape2D;

public class DemoShape2D {
    public static void main(String args[]){
        Circle c1 = new Circle(new Ponto2D(0,0), 100);
        Circle c2 = new Circle(new Ponto2D(-1,-1), 1);
        Circle c3 = new Circle(new Ponto2D(10,8), 0);

        Rectangle r1 = new Rectangle(new Ponto2D(-2, -2),
                                     new Ponto2D(2, 2));
        Rectangle r2 = new Rectangle(new Ponto2D(100, 0),
                                     new Ponto2D(0, 100));
        Rectangle r3 = new Rectangle(new Ponto2D(0, 0),
                                     new Ponto2D(1, 1));

        printAllData(c1);
        printAllData(c2);
        printAllData(c3);
        printAllData(r1);
        printAllData(r2);
        printAllData(r3);
    }

    private static void printAllData(Shape2D sh){
        System.out.println(sh);
        System.out.println("Centroide:"+ sh.center());
        System.out.printf("Perimeter: %.3f\n", sh.calPerimeter());
        System.out.printf("Area: %.3f\n", sh.calArea());
        System.out.println();
    }
}
