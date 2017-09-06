package design_pattern.factory.abstractFactory.ingredients.NYIngredients;

import design_pattern.factory.abstractFactory.ingredients.Pepperoni;

public class SlicedPepperoni implements Pepperoni {
    @Override
    public String getName() {
        return "Sliced pepperoni";
    }
}
