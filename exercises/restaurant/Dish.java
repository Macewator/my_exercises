package exercises.restaurant;

public class Dish {
    private String id;
    private String dishName;
    private double dishPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public double getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }

    public Dish(String id, String dishName, double dishPrice) {
        this.id = id;
        this.dishName = dishName;
        this.dishPrice = dishPrice;
    }

    @Override
    public String toString() {
        return  id + ", " + dishName + ", " + dishPrice + "zł";
    }
}
