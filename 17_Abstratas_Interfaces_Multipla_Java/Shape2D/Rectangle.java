package Shape2D;

public class Rectangle implements  Shape2D{
    private Ponto2D leftBottom, rightTop;

    Rectangle(Ponto2D lb, Ponto2D rt){
        leftBottom = lb;
        rightTop = rt;
    }

    private double edgeX(){
        return Math.abs(leftBottom.getX()- rightTop.getX());
    }

    private double edgeY(){
        return Math.abs(leftBottom.getY()- rightTop.getY());
    }

    @Override
    public Ponto2D center() {
        double pX = (leftBottom.getX() + rightTop.getX())/2;
        double pY = (leftBottom.getY() + rightTop.getY())/2;

        return new Ponto2D(pX, pY);
    }

    @Override
    public double calArea() {
        return edgeX()*edgeY();
    }

    @Override
    public double calPerimeter() {
        return 2*(edgeX()+edgeY());
    }

    @Override
    public String toString() {
        return "Rectangle by Points{" +
                "leftBottom=" + leftBottom +
                ", rightTop=" + rightTop +
                '}';
    }
}
