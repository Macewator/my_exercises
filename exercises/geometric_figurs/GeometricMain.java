package exercises.geometric_figurs;

public class GeometricMain {
    public static void main(String[] args) {
        Point point1 = new Point(6, 4);
        Point point2 = new Point(16, 4);
        Point point3 = new Point(16, 10);
        Point point4 = new Point(6, 10);

        Rectangle rectangle = new Rectangle(point1,point2,point3,point4);
        double result = rectangle.rectangleArea();
        System.out.println("Pole prostokąta wynosi: "+result);

        Point center = new Point(0, 0);
        Circle circle = new Circle(center, 5);
        Point ok = new Point(0, 3);
        Point notOk = new Point(0, 6);
        circle.pointInArea(ok);
        circle.pointInArea(notOk);
    }
}
