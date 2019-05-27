package exercises.barman;

public class Ingredient {
    String ingredient;
    double ml;

    public String getIngredient() {
        return ingredient;
    }

    public double getMl() {
        return ml;
    }

    public Ingredient(String ingredient, double ml) {
        this.ingredient = ingredient;
        this.ml = ml;
    }

    @Override
    public String toString() {
        return ingredient+", "+ml + " ml";
    }
}
