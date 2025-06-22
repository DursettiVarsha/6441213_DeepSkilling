public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();
        Observer mobile1 = new MobileApp("Mobile-001");
        Observer mobile2 = new MobileApp("Mobile-002");
        Observer web1 = new WebApp("WebClient-A");
        stockMarket.registerObserver(mobile1);
        stockMarket.registerObserver(mobile2);
        stockMarket.registerObserver(web1);
        stockMarket.setStockPrice(150.25);
        stockMarket.setStockPrice(153.75);
        stockMarket.removeObserver(mobile2);
        stockMarket.setStockPrice(157.00);
    }
}
