import java.util.Date;

public class ExpirationDate extends Product {
    private Date expiryDate;

    public ExpirationDate(String name, double price, int quantity, Date expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public boolean isExpired() {
        return new Date().after(expiryDate);
    }
}