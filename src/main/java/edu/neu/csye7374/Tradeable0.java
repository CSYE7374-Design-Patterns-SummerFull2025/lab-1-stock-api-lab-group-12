// file: Tradeable0.java
package edu.neu.csye7374;

/**
 * API #1: provides default implementations for both setBid() and getMetric()
 */
public interface Tradeable0 extends Tradable {
    default void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        System.out.println("[Tradeable0] default setBid(): received bid=" + bidValue);
    }

    default String getMetric() {
        return "[Tradeable0] default metric";
    }
}
