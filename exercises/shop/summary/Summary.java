package exercises.shop.summary;

import java.util.Arrays;
import java.util.List;

public class Summary {

    private DiscountService discountService;
    private List<Client> clients;

    public Summary(DiscountService discountService, Client... clients) {
        this.discountService = discountService;
        this.clients = Arrays.asList(clients);
    }

    public void customerSummary() {
        clients.forEach(client -> createSummary(client, client.getCart().getPrice()));
    }

    private void createSummary(Client client, double price) {
        String firstName = client.getFirstName();
        String lastName = client.getLastName();
        if (firstName != null && lastName == null)
            System.out.println("Witaj " + firstName);
        else if (firstName != null && lastName != null)
            System.out.println("Witaj " + firstName + " " + lastName);
        else if (firstName == null && lastName != null)
            System.out.println("Dzień dobry panie/pani " + lastName);
        else
            System.out.println("Witaj nieznajomy");
        printDiscountMessage(client, price);
    }

    private void printDiscountMessage(Client client, double price) {
        double priceDiscount = discountService.calculateDiscountPrice(client, price);
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}
