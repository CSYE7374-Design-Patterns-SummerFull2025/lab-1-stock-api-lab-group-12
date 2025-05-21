package edu.neu.csye7374;

/**
 * 
 * @author Yash Zaveri
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

        // get our singleton market
        StockMarket market = StockMarket.getInstance();

        // each student would use one unique subclass; here is TechStock
        TechStock ts = new TechStock("ABC Tech", 100.0, "Fast‐growing tech firm");
        market.addStock(ts);

        // provide 6 bids and observe price + metric changes
        String[] bids = { "105", "  98", "110.50", "120", "115.75", "130" };
        for (String bid : bids) {
            market.tradeStock("ABC Tech", bid.trim());
        }

        System.out.println();
        market.showAllStocks();

        System.out.println("\n\n============Main Execution End===================");
	}

}
