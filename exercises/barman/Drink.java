package exercises.barman;

import java.util.Arrays;

public class Drink {
    Ingredient[] ingredient;

    public Ingredient[] getIngredient() {
        return ingredient;
    }

    public Drink(Ingredient[] ingredient) {
        this.ingredient = ingredient;
    }

    @Override
    public String toString() {
        return "Drink ingredient: " + Arrays.toString(ingredient);
    }
}
