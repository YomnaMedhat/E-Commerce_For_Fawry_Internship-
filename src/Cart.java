import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<CartItems> items = new ArrayList<>();

    public void add(Product product, int quantity) {
        if (product.isExpired()) {
            throw new IllegalArgumentException(product.name + " is expired!");
        }
        if (quantity > product.quantity) {
            throw new IllegalArgumentException("Not enough stock for " + product.name);
        }
        items.add(new CartItems(product, quantity));
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public double getSubtotal() {
        double total = 0;
        for (CartItems item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public double getShippingCost() {
        return getShippableItems().isEmpty() ? 0 : 30.0;
    }

    public List<RequiresShipping> getShippableItems() {
        List<RequiresShipping> list = new ArrayList<>();
        for (CartItems item : items) {
            if (item.product instanceof RequiresShipping) {
                for (int i = 0; i < item.quantity; i++)
                    list.add((RequiresShipping) item.product);
            }
        }
        return list;
    }
}