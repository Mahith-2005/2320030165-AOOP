package salesdata;
public class SalesData {
    private String product;
    private double amount;

    public SalesData(String product, double amount) {
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public double getAmount() {
        return amount;
    }
}
