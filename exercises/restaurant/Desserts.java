package exercises.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Desserts implements DishAdder{
    private List<Dish> dessertsList = new ArrayList<>();

    public Desserts() {
        addDish();
    }

    @Override
    public void addDish() {
        dessertsList.add(new Dish("1","Ciasto czekoladowe", 34.90));
        dessertsList.add(new Dish("2","Tiramisu", 23.85));
    }

    @Override
    public List<Dish> getDish() {
        return dessertsList;
    }
}
