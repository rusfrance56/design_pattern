package design_pattern.decorator.added_content;

import design_pattern.decorator.Beverage;
import design_pattern.decorator.CondimentDecorator;

public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
