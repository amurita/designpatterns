/**
 * DecoyDuck class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        setFlightBehaviour(new NotFlying());
        setQuackBehavior(new MutedQuack());
    }
    public void displaying() {
        System.out.println("I'm a duck Decoy");
    }
}