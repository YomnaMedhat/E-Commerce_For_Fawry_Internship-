public class CheckoutService {
    public static void checkout(Customer customer, Cart cart) {
        if (cart.isEmpty()) {
            throw new IllegalStateException("Cart is empty!");
        }

        double subtotal = cart.getSubtotal();
        double shipping = cart.getShippingCost();
        double total = subtotal + shipping;

        if (!customer.canPay(total)) {
            throw new IllegalStateException("Insufficient balance");
        }

        for (CartItems item : cart.items) {
            if (item.quantity > item.product.quantity) {
                throw new IllegalStateException("Out of stock: " + item.product.getName());
            }
            item.product.quantity -= item.quantity;
        }

        ShippingService.ship(cart.getShippableItems());

        customer.pay(total);

        System.out.println("** Checkout receipt **");
        for (CartItems item : cart.items) {
            System.out.println(item.quantity + "x " + item.product.getName());
            System.out.println((int) item.getTotalPrice());
        }

        System.out.println("----------------------");
        System.out.println("Subtotal         " + (int) subtotal);
        System.out.println("Shipping         " + (int) shipping);
        System.out.println("Amount           " + (int) total);
        System.out.println("Customer balance " + (int) customer.balance);
    }
}