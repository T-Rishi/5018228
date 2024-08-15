
public class TestObserver {
     public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("Mobile App");
        Observer webApp = new WebApp("Web App");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("ABC", 150.00);
        stockMarket.setStockPrice("DEF", 2800.00);

        stockMarket.deregisterObserver(mobileApp);
        stockMarket.setStockPrice("GHI", 299.00);
    }
}
