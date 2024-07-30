package DigitalNuture;

public class ObserverPatternTest {
	
	    public static void main(String[] args) {
	        StockMarket stockMarket = new StockMarket();

	        Observer mobileApp = new MobileApp("MobileApp1");
	        Observer webApp = new WebApp("WebApp1");

	        stockMarket.registerObserver(mobileApp);
	        stockMarket.registerObserver(webApp);

	        // Simulate stock price changes
	        System.out.println("Setting stock price to 100.0");
	        stockMarket.setStockPrice(100.0);

	        System.out.println("Setting stock price to 105.5");
	        stockMarket.setStockPrice(105.5);

	        stockMarket.deregisterObserver(mobileApp);

	        System.out.println("Setting stock price to 110.0");
	        stockMarket.setStockPrice(110.0);
	    }
	}



