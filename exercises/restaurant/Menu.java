package exercises.restaurant;

import java.util.*;

public class Menu implements DishAdder{
    private Map<DishType, DishAdder> menuMap = new HashMap<>();

    public Menu() {
        addDish();
    }

    @Override
    public void addDish() {
        menuMap.put(DishType.DESSERT, new Desserts());
        menuMap.put(DishType.PASTA, new Pastas());
        menuMap.put(DishType.MEAT, new MeatDish());
    }

    public Map<DishType, DishAdder> getMenuMap() {
        return menuMap;
    }

    public void showMenu(String chosenType){
        for (Dish dish: menuMap.get(DishType.select(chosenType)).getDish()){
            System.out.println(dish);
        }
    }
}
