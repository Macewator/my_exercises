package exercises.restaurant;

public class Restaurant {
    private Menu menu = new Menu();
    private Order order = new Order();
    private PaymentService paymentService = new PaymentService();

    public void takeOrder(){
        String chosenType = order.showMenuTypes();
        menu.showMenu(chosenType);
        double dishPrice = paymentService.dishesPrice(order.chooseDishes(),menu,chosenType);
        double servicePrice = paymentService.servicePrice(dishPrice);
        System.out.printf("Do zapłaty: %.2f w tym: \n", (dishPrice+servicePrice));
        System.out.printf("cena dań: %.2f\n",dishPrice);
        System.out.printf("cena obsługi: %.2f\n",servicePrice);
    }

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.takeOrder();
    }

}
