public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        Product p1 = new Product(101, "Laptop", 10, 75000);
        Product p2 = new Product(102, "Mouse", 50, 500);
        Product p3 = new Product(103, "Keyboard", 30, 1200);

        manager.addProduct(p1);
        manager.addProduct(p2);
        manager.addProduct(p3);

        manager.viewInventory();

        manager.updateProduct(102, 60, 550); 
        manager.deleteProduct(103);          

        manager.viewInventory();
    }
}
