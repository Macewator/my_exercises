package exercises.restaurant;

public class PaymentService {

    private final static int PROMO = 100;
    private final static double FULL_SERVICE = 0.15;
    private final static double PROMO_SERVICE = 0.1;

    public double servicePrice(Double price){
        if (price < PROMO){
            return price*FULL_SERVICE;
        }else {
           return price*PROMO_SERVICE;
        }
    }

    public double dishesPrice(String[] order, Menu menu, String chosenType){
        double finalPrice = 0;
        for (String s: order){
            for (Dish dish: menu.getMenuMap().get(DishType.select(chosenType)).getDish()){
                if(dish.getId().equals(s)){
                    finalPrice += dish.getDishPrice();
                }
            }
        }
        return finalPrice;
    }
}
