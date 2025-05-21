// file: FinanceStock.java
package edu.neu.csye7374;

/**
 * Simulates a finance‐sector stock with asymmetric sensitivity:
 *  • small upticks (10% of gap)
 *  • larger downticks (20% of gap)
 * Metric is the natural log of price relative to initial, to highlight compounding.
 */
public class FinanceStock extends Stock implements Tradeable1 {

    public FinanceStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        if (bidValue > price) {
            this.price += (bidValue - price) * 0.10;
        } else {
            this.price += (bidValue - price) * 0.20;
        }
        System.out.printf("FinanceStock %s new price = %.2f%n", name, price);
    }

    @Override
    public String getMetric() {
        double metric = Math.log(price / initialPrice);
        return String.format("%.4f", metric);
    }
}
