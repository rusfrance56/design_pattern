package design_pattern.decorator.drink;

import design_pattern.decorator.Beverage;

public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "House blend coffe";
    }

    @Override
    public double cost() {
        return .89;
    }
}
