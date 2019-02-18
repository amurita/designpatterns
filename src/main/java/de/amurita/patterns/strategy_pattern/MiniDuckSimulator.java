/**
 * MiniDuckSimulator class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck decoyduck = new DecoyDuck();

        mallard.performQuack();
        mallard.performFlying();

        decoyduck.performQuack();
        decoyduck.performFlying();

    }
}