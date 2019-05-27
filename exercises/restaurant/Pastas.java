package exercises.restaurant;

import java.util.ArrayList;
import java.util.List;

public class Pastas implements DishAdder{
    private List<Dish> pastsList = new ArrayList<>();

    public Pastas() {
       addDish();
    }

    @Override
    public void addDish() {
        pastsList.add(new Dish("1","Tagliatelle", 50.30));
        pastsList.add(new Dish("2","Canneloni",45.99));
    }

    @Override
    public List<Dish> getDish() {
        return pastsList;
    }
}
