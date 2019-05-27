package exercises.drawing;

public class Square implements Drawable{

    private int side;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw(){
        for(int i = 0; i<side; i++){
            bSideDraw();
            System.out.println();
        }
    }

    private void bSideDraw(){
        for(int i = 0; i<side; i++){
            System.out.print("* ");
        }
    }
}
