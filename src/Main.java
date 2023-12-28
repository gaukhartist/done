

public class Main {
    public static void main(String[] args) {

        Product Gucci = new Product("Gucci T-shirt", 999.99, 1);
        Product Zara = new Product("Zara coat", 399.99, 2);

        Customer customer = new Customer("Gia Stefan", "221 Main St");

        customer.getShoppingCart().addProduct(laptop);
        customer.getShoppingCart().addProduct(phone);


        customer.getShoppingCart().displayCart();
        System.out.println("Total: $" + customer.getShoppingCart().calculateTotal());
    }
}
