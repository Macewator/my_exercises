package exercises.drawing;

public class Rectangle implements Drawable{

    private int aSide;
    private int bSide;

    public Rectangle(int aSide, int bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    @Override
    public void draw(){
        for(int i = 0; i<bSide; i++){
            bSideDraw();
            System.out.println();
        }
    }

    private void bSideDraw(){
        for(int i = 0; i<aSide; i++){
            System.out.print("* ");
        }
    }
}
