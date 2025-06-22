import java.util.HashMap;

public class ProxyImage implements Image {
    private static HashMap<String, RealImage> imageCache = new HashMap<>();
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        RealImage realImage = imageCache.get(fileName);
        if (realImage == null) {
            realImage = new RealImage(fileName);
            imageCache.put(fileName, realImage);
        } else {
            System.out.println("Retrieved from cache: " + fileName);
        }
        realImage.display();
    }
}
