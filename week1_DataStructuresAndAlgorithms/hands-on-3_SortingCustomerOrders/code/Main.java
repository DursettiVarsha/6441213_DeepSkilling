public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(201, "Alice", 2500.0),
            new Order(202, "Bob", 1200.0),
            new Order(203, "Charlie", 3300.0),
            new Order(204, "Diana", 1800.0)
        };

        System.out.println("Original Orders:");
        OrderSorter.printOrders(orders);

        System.out.println("\nSorted with Bubble Sort:");
        OrderSorter.bubbleSort(orders);
        OrderSorter.printOrders(orders);

        orders = new Order[]{
            new Order(201, "Alice", 2500.0),
            new Order(202, "Bob", 1200.0),
            new Order(203, "Charlie", 3300.0),
            new Order(204, "Diana", 1800.0)
        };

        System.out.println("\nSorted with Quick Sort:");
        OrderSorter.quickSort(orders, 0, orders.length - 1);
        OrderSorter.printOrders(orders);
    }
}
