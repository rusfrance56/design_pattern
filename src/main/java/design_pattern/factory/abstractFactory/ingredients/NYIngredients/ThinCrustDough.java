package design_pattern.factory.abstractFactory.ingredients.NYIngredients;

import design_pattern.factory.abstractFactory.ingredients.Dough;

public class ThinCrustDough implements Dough {
    @Override
    public String getName() {
        return "Thin crust dough";
    }
}
