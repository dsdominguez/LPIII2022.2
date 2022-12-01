package Shape2D;

public class Ponto2D {
    private double x, y;

    public Ponto2D(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Ponto2D(){
        this(0,0);
    }

    public String toString(){
        return "("+x+", "+y+")";
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
