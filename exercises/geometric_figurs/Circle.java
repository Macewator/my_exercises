package exercises.geometric_figurs;

public class Circle {

    private Point s;
    private double r;

    public Point getS() {
        return s;
    }

    public void setS(Point s) {
        this.s = s;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle(Point s, double r) {
        this.s = s;
        this.r = r;
    }

    public void pointInArea(Point point){
        if(Math.pow(s.getX() - point.getX(), 2) + Math.pow(s.getY() - point.getY(), 2)< Math.pow(r, 2)){
            System.out.println("Punkt znajduje się wewnątrz okręgu");
        }else {
            System.out.println("Punkt leży poza okręgiem");
        }
    }
}
