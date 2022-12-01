package Shape2DHM;

import Shape2D.Shape2D;
import Shape2D.Ponto2D;

public class CircleScalavel implements Shape2D, Scalavel {
    private Ponto2D center;
    private double radius;

    CircleScalavel(Ponto2D center, double radius){
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
                //", Pi =" + mPi +
                '}';
    }

    @Override
    public void changeSize(double scale) {
        radius *= scale;
    }

    @Override
    public void reflectShape() {
        center = new Ponto2D(-center.getX(), center.getY());
    }
}
