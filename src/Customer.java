class Customer {
    private String name;
    private String address;
    private ShoppingCart shoppingCart;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
        this.shoppingCart = new ShoppingCart();
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
}