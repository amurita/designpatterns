/**
 * Duck class (Strategy pattern).
 * @version 1.0 18th of February, 2019
 * @author Amurita
 */

package de.amurita.patterns.strategy_pattern;

public abstract class Duck {

    FlightBehaviour flightBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(){}



    public void setFlightBehaviour(FlightBehaviour committedFlightBehaviour) {
        flightBehaviour = committedFlightBehaviour;
    }

    public void setQuackBehavior(QuackBehaviour committedQuackBehaviour) {
        quackBehaviour = committedQuackBehaviour;
    }

    abstract void displaying();

    public void performFlying() {
        flightBehaviour.flying();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swimming() {
        System.out.println("All ducks float, even decoy ducks!");
    }
}