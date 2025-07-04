// file: Tradable.java
package edu.neu.csye7374;

public interface Tradable {
    /**
     * place a bid to buy a stock
     * @param bid
     */
    void setBid(String bid);

    /**
     * return a metric indicating measure of positive performance of this stock
     * where a large positive index means consider buying this well performing stock,
     * and where a large negative index means consider selling this poorly performing stock.
     */
    String getMetric();
}
