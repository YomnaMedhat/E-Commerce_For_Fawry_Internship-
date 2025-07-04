import java.util.Date;

public class PreShipping extends ExpirationDate implements RequiresShipping {
    private double weight;

    public PreShipping(String name, double price, int quantity, Date expiryDate, double weight) {
        super(name, price, quantity, expiryDate);
        this.weight = weight;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}