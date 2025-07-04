import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            Date date = new GregorianCalendar(2025, Calendar.AUGUST, 1).getTime();

            Product cheese = new PreShipping("Cheese", 50, 5, date, 0.2);
            Product biscuits = new PreShipping("Biscuits", 150, 2, date, 0.7);
            Product tv = new ShippableProduct("TV", 1000, 3, 7.0);

            Product cards = new Product("Cards", 50, 10) {
            };

            Customer customer = new Customer("Ali", 1000);

            Cart cart = new Cart();
            cart.add(cheese, 2);
            cart.add(biscuits, 1);
            cart.add(cards, 1);

            CheckoutService.checkout(customer, cart);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}