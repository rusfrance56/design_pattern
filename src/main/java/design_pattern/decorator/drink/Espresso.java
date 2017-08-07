package design_pattern.decorator.drink;

import design_pattern.decorator.Beverage;

public class Espresso extends Beverage {
    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
