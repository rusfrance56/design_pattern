package design_pattern.strategy.entity;

import design_pattern.strategy.behavior.DuckTrapSong;
import design_pattern.strategy.behavior.Flyable;
import design_pattern.strategy.behavior.NoFly;
import design_pattern.strategy.behavior.Quackable;

public class DuckManok extends Duck{
    public DuckManok() {
        this.flyBehavior = new NoFly();
        this.quackBehavior = new DuckTrapSong();
    }

    public DuckManok(Quackable quackBehavior, Flyable flyBehavior) {
        super(quackBehavior, flyBehavior);
    }

    public String show() {
        return "This is duck Manok!";
    }
}
