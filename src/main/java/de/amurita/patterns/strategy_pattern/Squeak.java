/**
 * Squeak class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public class Squeak implements QuackBehaviour {
    public void quack() {
        System.out.println("Squeak!!!");
    }
}
