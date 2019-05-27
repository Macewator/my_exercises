package exercises.restaurant;

import java.util.List;

public interface DishAdder {

    void addDish();
    default List<Dish> getDish() {
        return null;
    }
}
