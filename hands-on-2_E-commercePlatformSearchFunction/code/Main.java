public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Chair", "Furniture"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Book", "Stationery")
        };

        System.out.println("=== Linear Search ===");
        Product result1 = SearchService.linearSearch(products, "Chair");
        System.out.println(result1 != null ? result1 : "Product not found");

        System.out.println("\n=== Binary Search ===");
        SearchService.sortProductsByName(products); // Sorting before binary search
        Product result2 = SearchService.binarySearch(products, "Chair");
        System.out.println(result2 != null ? result2 : "Product not found");
    }
}
