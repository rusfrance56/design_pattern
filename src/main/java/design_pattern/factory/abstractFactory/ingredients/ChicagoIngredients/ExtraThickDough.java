package design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients;

import design_pattern.factory.abstractFactory.ingredients.Dough;

public class ExtraThickDough implements Dough {
    @Override
    public String getName() {
        return "Extra thick dough";
    }
}
