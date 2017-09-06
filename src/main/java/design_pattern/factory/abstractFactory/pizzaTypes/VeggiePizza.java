package design_pattern.factory.abstractFactory.pizzaTypes;

import design_pattern.factory.abstractFactory.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public Pizza prepare() {
        System.out.println("Preparing " + name);
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSause();
        this.toppings = ingredientFactory.createVeggies();
        this.cheese = ingredientFactory.createCheese();
        return this;
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
