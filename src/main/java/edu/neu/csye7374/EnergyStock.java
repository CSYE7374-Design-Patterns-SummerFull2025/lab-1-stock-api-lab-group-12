// file: EnergyStock.java
package edu.neu.csye7374;

/**
 * Simulates an energy‐sector stock that reacts quickly to new bids.
 * Price update is a 50/50 blend of old price and new bid.
 * Metric is the absolute dollar change from the initial price.
 */
public class EnergyStock extends Stock implements Tradeable1 {

    public EnergyStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price = this.price * 0.5 + bidValue * 0.5;
        System.out.printf("EnergyStock %s new price = %.2f%n", name, price);
    }

    @Override
    public String getMetric() {
        double change = price - initialPrice;
        return String.format("$%.2f", change);
    }
}
