class Order {
    // Define a static int totalOrders field, starting at 0
    static int totalOrders = 0;

    // Constructor increments totalOrders by 1 every single time
    public Order() {
        totalOrders++;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create four Order objects
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        // Print Order.totalOrders exactly once, accessed through the class name
        System.out.println("Total orders: " + Order.totalOrders);
    }
}