/**
 * MallardDuck class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehaviour = new Quack();
        flightBehaviour = new FlyingWithWings();
        //setFlightBehaviour(new FlyingWithWings());
        //setQuackBehavior(new Quack());
    }

    public void displaying() {
        System.out.println("I'm a mallard duck!!!");
    }
}