// file: Stock.java
package edu.neu.csye7374;

/**
 * Abstract super‐class for all stocks.
 */
public abstract class Stock {
    protected String name;
    protected double price;
    protected String description;
    protected final double initialPrice;

    public Stock(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.initialPrice = price;
    }

    /** Place a bid—concrete logic in subclasses or via default interface methods */
    public abstract void setBid(String bid);

    /** Each subclass provides its own performance‐metric logic */
    public abstract String getMetric();

    @Override
    public String toString() {
        return String.format(
            "Stock{name='%s', price=%.2f, description='%s', metric=%s}",
             name, price, description, getMetric()
        );
    }
}
