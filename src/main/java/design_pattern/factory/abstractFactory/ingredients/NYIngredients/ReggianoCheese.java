package design_pattern.factory.abstractFactory.ingredients.NYIngredients;

import design_pattern.factory.abstractFactory.ingredients.Cheese;

public class ReggianoCheese implements Cheese {
    @Override
    public String getName() {
        return "Reggiano cheese";
    }
}
