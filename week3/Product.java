class Product {
    // Define fields
    String productId;
    String productName;

    // Constructor with parameters
    public Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }

    public static void main(String[] args) {
        // Create one Product object through the constructor
        Product product = new Product("P-1042", "Wireless Mouse");

        // Print its two fields on one line
        System.out.println(product.productId + " - " + product.productName);
    }
}