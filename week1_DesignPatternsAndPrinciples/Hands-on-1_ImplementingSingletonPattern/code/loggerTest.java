// Main.java
public class loggerTest {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("First message");
        logger2.log("Second message");

        // Check whether both references point to the same object
        if (logger1 == logger2) {
            System.out.println("Both logger instances are the same (singleton works).");
        } else {
            System.out.println("Logger instances are different (singleton failed).");
        }
    }
}
