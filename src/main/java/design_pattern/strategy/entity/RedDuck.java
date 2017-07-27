package design_pattern.strategy.entity;

import design_pattern.strategy.behavior.Flyable;
import design_pattern.strategy.behavior.Quackable;
import design_pattern.strategy.behavior.RedDuckSong;
import design_pattern.strategy.behavior.SimpleFly;

public class RedDuck extends Duck {

    public RedDuck() {
        this.flyBehavior = new SimpleFly();
        this.quackBehavior = new RedDuckSong();
    }

    public RedDuck(Quackable quackBehavior, Flyable flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    public String show() {
        return "This is red duck!";
    }
}
