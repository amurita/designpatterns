/**
 * NotFlying class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public class NotFlying implements FlightBehaviour {
    public void flying() {
        System.out.println("I'm not flying!!!");
    }
}
