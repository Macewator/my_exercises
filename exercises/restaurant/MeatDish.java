package exercises.restaurant;

import java.util.ArrayList;
import java.util.List;

public class MeatDish implements DishAdder{
    private List<Dish> meatList = new ArrayList<>();

    public MeatDish() {
        addDish();
    }

    @Override
    public void addDish() {
        meatList.add(new Dish("1","Stek",38.40));
        meatList.add(new Dish("2","Burger", 25.50));
    }

    @Override
    public List<Dish> getDish() {
        return meatList;
    }
}
