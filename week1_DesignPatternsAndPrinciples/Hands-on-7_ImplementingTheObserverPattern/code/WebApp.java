public class WebApp implements Observer {
    private String clientName;

    public WebApp(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(double newPrice) {
        System.out.println("WebApp [" + clientName + "] received stock price update: " + newPrice);
    }
}
