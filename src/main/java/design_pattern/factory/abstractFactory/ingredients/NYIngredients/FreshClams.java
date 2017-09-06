package design_pattern.factory.abstractFactory.ingredients.NYIngredients;

import design_pattern.factory.abstractFactory.ingredients.Clams;

public class FreshClams implements Clams {
    @Override
    public String getName() {
        return "Fresh clams";
    }
}
