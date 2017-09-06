package design_pattern.factory.abstractFactory.ingredients.NYIngredients;

import design_pattern.factory.abstractFactory.ingredients.Sauce;

public class MarinaraSauce implements Sauce {
    @Override
    public String getName() {
        return "Marinara sauce";
    }
}
