package design_pattern.factory.abstractFactory.ingredients.ChicagoIngredients;

import design_pattern.factory.abstractFactory.ingredients.Cheese;

public class MozzarellaCheese implements Cheese {
    @Override
    public String getName() {
        return "Mozzarella cheese";
    }
}
