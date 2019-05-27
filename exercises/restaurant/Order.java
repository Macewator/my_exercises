package exercises.restaurant;

import java.util.Scanner;

public class Order {

    private Scanner scanner;

    public Order() {
        scanner = new Scanner(System.in);
    }

    public String showMenuTypes(){
        DishType.showDishType();
        return scanner.nextLine();
    }

    public String[] chooseDishes(){
        String order = scanner.nextLine();
        return order.split(",");
    }
}
