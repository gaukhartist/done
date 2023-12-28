import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice() * product.getQuantity();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (Product product : cartItems) {
            System.out.println("Product: " + product.getProductName() +
                    ", Quantity: " + product.getQuantity() +
                    ", Price: $" + product.getPrice());
        }
    }
}