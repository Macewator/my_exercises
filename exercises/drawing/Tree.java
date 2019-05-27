package exercises.drawing;

public class Tree implements Drawable{

    private int firstStar = 1;
    private int height;

    public Tree(int height) {
        this.height = height;
    }

    @Override
    public void draw(){
        int space = height;
        int stars = firstStar;
        for(int i = 0; i<height; i++){
            space(space);
            stars(stars);
            System.out.println();
            space--;
            stars += 2;
        }

    }

    private void space(int space){
        for(int i = 0; i<space; i++){
            System.out.print(" ");
        }
    }
    private void stars(int stars){
        for(int i = 0; i<stars; i++){
            System.out.print("*");
        }
    }
}
