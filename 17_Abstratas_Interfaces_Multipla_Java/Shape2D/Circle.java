package Shape2D;

public class Circle implements  Shape2D{
    private Ponto2D center;
    private double radius;

    Circle(Ponto2D center, double radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public Ponto2D center(){
        return center;
    }

    @Override
    public double calArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double calPerimeter() {
        return 2.0*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
