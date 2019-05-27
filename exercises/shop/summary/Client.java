package exercises.shop.summary;

public class Client {
    private String firstName;
    private String lastName;
    private boolean premium;
    private Cart cart;

    public Client(String firstName, String lastName, boolean premium, Cart cart) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.premium = premium;
        this.cart = cart;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
