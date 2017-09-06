package design_pattern.factory.abstractFactory.pizzaTypes;

import design_pattern.factory.abstractFactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSause();
        this.cheese = ingredientFactory.createCheese();
        this.clams = ingredientFactory.createClam();
        return this;
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
