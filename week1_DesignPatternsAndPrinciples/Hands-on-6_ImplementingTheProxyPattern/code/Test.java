public class Test {
    public static void main(String[] args) {
        Image img1 = new ProxyImage("photo1.jpg");
        Image img2 = new ProxyImage("photo2.jpg");
        Image img3 = new ProxyImage("photo1.jpg");  // Should use cache

        img1.display(); // Loads and displays
        System.out.println();
        img2.display(); // Loads and displays
        System.out.println();
        img3.display(); // Uses cached image
    }
}
