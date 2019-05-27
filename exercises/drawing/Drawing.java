package exercises.drawing;

import java.util.Scanner;

public class Drawing {

    private static final String TREE = "tree";
    private static final String RECTANGLE = "rectangle";
    private static final String SQUARE = "square";

    private static Scanner scanner = new Scanner(System.in);

    private static String option(){
        System.out.println("Co chcesz narysować tree/rectangle/square");
        return scanner.nextLine();
    }

    private static Tree drawTree(){
        System.out.println("Podaj długość wysokoś drzewka");
        return new Tree(scanner.nextInt());
    }

    private static Rectangle drawRectangle(){
        System.out.println("Podaj długość boku a");
        int a = scanner.nextInt();
        System.out.println("Podaj długość boku b");
        int b = scanner.nextInt();
        return new Rectangle(a,b);
    }

    private static Square drawSquare(){
        System.out.println("Podaj długość boku");
        int a = scanner.nextInt();
        return new Square(a);
    }

    private static Drawable readAndCreateShape() {
        Drawable drawable = null;
        String element = option();
        switch (element) {
            case RECTANGLE:
                drawable = drawRectangle();
                break;
            case SQUARE:
                drawable = drawSquare();
                break;
            case TREE:
                drawable = drawTree();
                break;
            default:
                System.out.println("Taki kształt nie istnieje");
        }
        return drawable;
    }

    public static void main(String[] args) {
       Drawable drawable = readAndCreateShape();
       if(drawable != null){
           drawable.draw();
       }
    }
}
