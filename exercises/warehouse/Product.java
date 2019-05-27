package exercises.magazyn;

import java.util.StringJoiner;

public class Product {

    private String productName;
    private int productAmount;
    private String percentage;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public Product(String productName, int productAmount, String percentage) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return new StringJoiner(" ")
                .add(productName +"     ")
                .add(String.format("(%s)",productAmount))
                .add(percentage)
                .toString();
    }
}
