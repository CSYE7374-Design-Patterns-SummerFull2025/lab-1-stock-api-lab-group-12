// file: HealthStock.java
package edu.neu.csye7374;

/**
 * Simulates a healthcare‐sector stock that drifts slowly:
 * Price moves just 5% toward the new bid each trade.
 * Metric is the current‐price / initial‐price ratio (×1 = unchanged).
 */
public class HealthStock extends Stock implements Tradeable1 {

    public HealthStock(String name, double price, String description) {
        super(name, price, description);
    }

    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        this.price += 0.05 * (bidValue - this.price);
        System.out.printf("HealthStock %s new price = %.2f%n", name, price);
    }

    @Override
    public String getMetric() {
        double ratio = price / initialPrice;
        return String.format("%.3f", ratio);
    }
}
