package exercises.shop.summary;

public class DicountApp {
    public static void main(String[] args) {
        Client client1 = new Client(null, "Kowalski", true, new Cart(2100));

        Client client2 = new Client("Karol", "Nowak", false, new Cart(1100));

        Client client3 = new Client(null, null, true, new Cart(1650));

        DiscountService discountService = new DiscountService();
        Summary summary = new Summary(discountService, client1, client2, client3);
        summary.customerSummary();

    }
}
