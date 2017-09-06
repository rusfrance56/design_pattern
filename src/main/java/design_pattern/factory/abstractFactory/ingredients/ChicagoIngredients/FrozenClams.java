package design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients;

import design_pattern.factory.abstractFactory.ingredients.Clams;

public class FrozenClams implements Clams {
    @Override
    public String getName() {
        return "Frozen clams";
    }
}
