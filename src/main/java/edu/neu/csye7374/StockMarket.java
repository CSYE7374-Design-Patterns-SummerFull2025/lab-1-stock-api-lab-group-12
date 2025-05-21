// file: StockMarket.java
package edu.neu.csye7374;

import java.util.*;

/**
 * Lazy‐loaded singleton “exchange.”
 */
public class StockMarket {
    private static StockMarket instance;
    private final Map<String, Stock> stocks;

    private StockMarket() {
        stocks = new HashMap<>();
    }

    public static synchronized StockMarket getInstance() {
        if (instance == null) {
            instance = new StockMarket();
        }
        return instance;
    }

    /** A. Add a stock */
    public void addStock(Stock stock) {
        stocks.put(stock.name, stock);
        System.out.println("Added stock: " + stock.name);
    }

    /** B. Trade a stock (updates price via setBid + shows new state) */
    public void tradeStock(String name, String bid) {
        Stock s = stocks.get(name);
        if (s == null) {
            System.out.println("No stock named “" + name + "” found.");
            return;
        }
        s.setBid(bid);
        System.out.println(" → after trade: " + s);
    }

    /** C. Remove a stock */
    public void removeStock(String name) {
        if (stocks.remove(name) != null) {
            System.out.println("Removed stock: " + name);
        } else {
            System.out.println("No stock named “" + name + "” to remove.");
        }
    }

    /** D. Show all stocks */
    public void showAllStocks() {
        System.out.println("=== All stocks on the market ===");
        stocks.values().forEach(System.out::println);
    }
}
