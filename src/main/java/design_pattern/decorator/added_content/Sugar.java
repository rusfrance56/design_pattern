package design_pattern.decorator.added_content;

import design_pattern.decorator.Beverage;
import design_pattern.decorator.CondimentDecorator;

public class Sugar extends CondimentDecorator {

    private Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", sugar";
    }

    @Override
    public double cost() {
        return .05 + beverage.cost();
    }
}
