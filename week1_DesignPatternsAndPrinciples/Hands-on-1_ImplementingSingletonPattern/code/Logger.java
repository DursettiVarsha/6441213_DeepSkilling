public class Logger {

    // Eager initialization to avoid threading issues in basic examples
    private static final Logger instance = new Logger();
    private Logger() {
        System.out.println("Logger initialized.");
    }
    public static Logger getInstance() {
        return instance;
    }
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
