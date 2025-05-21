// file: Tradeable1.java
package edu.neu.csye7374;

/**
 * API #2: provides a default implementation only for getMetric()
 */
public interface Tradeable1 extends Tradable {
    // no default setBid—implementing classes must define it
    default String getMetric() {
        return "[Tradeable1] default metric";
    }
}
