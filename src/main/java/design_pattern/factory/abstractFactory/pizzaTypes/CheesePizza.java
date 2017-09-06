package design_pattern.factory.abstractFactory.pizzaTypes;

import design_pattern.factory.abstractFactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSause();
        this.cheese = ingredientFactory.createCheese();
        return this;
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
