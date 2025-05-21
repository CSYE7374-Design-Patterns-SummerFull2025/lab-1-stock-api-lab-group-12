// file: TechStock.java
package edu.neu.csye7374;

/**
 * Example of a concrete subclass.  Implements Tradeable1,
 * so must define setBid(), and we override getMetric()
 * with our own “percent‐change” calculation.
 */
public class TechStock extends Stock implements Tradeable1 {

    public TechStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        // e.g. a weighted‐average update
        this.price = this.price * 0.7 + bidValue * 0.3;
        System.out.printf("TechStock %s new price = %.2f%n", name, price);
    }

    @Override
    public String getMetric() {
        double pct = (price - initialPrice) / initialPrice * 100;
        return String.format("%.2f%%", pct);
    }
}
