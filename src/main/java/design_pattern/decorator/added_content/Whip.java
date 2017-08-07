package design_pattern.decorator.added_content;

import design_pattern.decorator.Beverage;
import design_pattern.decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
