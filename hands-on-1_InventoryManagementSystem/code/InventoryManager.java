import java.util.HashMap;

public class InventoryManager {
    private HashMap<Integer, Product> inventory = new HashMap<>();

    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
        System.out.println("Added: " + product);
    }

    public void updateProduct(int productId, int newQuantity, double newPrice) {
        Product product = inventory.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("Updated: " + product);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    public void deleteProduct(int productId) {
        Product removed = inventory.remove(productId);
        if (removed != null) {
            System.out.println("Deleted: " + removed);
        } else {
            System.out.println("Product ID " + productId + " not found.");
        }
    }

    public void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("Inventory:");
        for (Product p : inventory.values()) {
            System.out.println(p);
        }
    }
}
