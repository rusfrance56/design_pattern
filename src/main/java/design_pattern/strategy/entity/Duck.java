package design_pattern.strategy.entity;

import design_pattern.strategy.behavior.Flyable;
import design_pattern.strategy.behavior.Quackable;

public abstract class Duck {
    protected Quackable quackBehavior;
    protected Flyable flyBehavior;

    public Duck() {
    }

    public Duck(Quackable quackBehavior, Flyable flyBehavior) {
        this.quackBehavior = quackBehavior;
        this.flyBehavior = flyBehavior;
    }

    public abstract String show();

    public String sayQuack() {
        return quackBehavior.sayQuack();
    }

    public String fly() {
        return flyBehavior.fly();
    }
}
